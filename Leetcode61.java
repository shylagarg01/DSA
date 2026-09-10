class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null){
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        k = k%size;
        if(k==0){
            return head;
        }
        temp = head;
        for(int i=1; i<size-k; i++){
            temp = temp.next;
        }
        ListNode second = temp.next;
        temp.next = null;
        temp = second;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = head;
        return second;
    }
}


