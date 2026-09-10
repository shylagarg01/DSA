class Solution {
    public int getKthFromLast(Node head, int k) {
        
        // code here
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(k<0 || k>size){
            return -1;
        }
        if(k==size){
            return head.data;
        }
        Node slow = head;
        Node fast = head;
        for(int i=0; i<k; i++){
            fast = fast.next;
        }
        while(fast!=null ){
            slow = slow.next;
            fast = fast.next;
            
        }
        return slow.data;
    }
}

