class Solution {
    Node removeDuplicates(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                Node next = temp.next.next;
                temp.next = next;
                if(next!=null){
                    next.prev = temp;
                }
            } else{
                temp = temp.next;
            }
        }
        
        return head;
    }
}
