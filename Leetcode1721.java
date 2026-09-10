class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode first = head;
        for(int i=1; i<k; i++){
            first = first.next;
        }
        ListNode second = head;
        ListNode fast = first;
        
        while(fast.next!=null){
            second = second.next;
            fast = fast.next;
        }
        // ListNode second = slow;

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}

