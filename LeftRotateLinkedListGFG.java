class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head == null || head.next==null){
            return head;
        }
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        temp = head;
        k = k%size;
        if(k==0){
            return head;
        }
        for(int i=1; i<k; i++){
            temp = temp.next;
        }
        Node first = temp.next;
        temp.next = null;
        temp = first;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        return first;
        
    }
}

