class Solution {
    public Node rotateDLL(Node head, int k) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        
        if(k==0 || k==size){
            return head;
        }
        
        temp = head;
        for(int i=1; i<k; i++){
            temp = temp.next;
        }
        
        Node newHead = temp.next;
        newHead.prev = null;
        temp.next = null;
        
        Node t = newHead;
        while(t.next!=null){
            t=t.next;
        }
        t.next = head;
        head.prev = t;
        
        return newHead;
    }
}

