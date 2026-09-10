class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        dummy.next = head;
        
        while(temp.next!=null && temp.next.next!=null){
            ListNode first = temp.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            temp.next = second;
            temp = first;
            
        }
        return dummy.next;

    }
}
