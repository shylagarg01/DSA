
class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }

        Node temp = head;
        while(temp!=null){
            if(temp.child!=null){
                Node forward = temp.next;
                Node c = flatten(temp.child);
                temp.child = null;
                temp.next = c;
                c.prev = temp;

                Node t = c;
                while(t.next!=null){
                    t = t.next;
                }
                t.next = forward;
                if(forward!=null){
                    forward.prev = t;
                }



                temp = forward;
            } else{
                temp = temp.next;
            }
        }
        return head;
    }
}
