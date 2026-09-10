class Solution {
    public int pairSum(ListNode head) {
        if(head==null || head.next==null){
            return head.val;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode second = prev;

        int maxSum = 0;
        ListNode temp1 = head;
        ListNode temp2 = second;
        while(temp1!=null || temp2!=null){
            if(temp1.val+temp2.val>maxSum){
                maxSum = temp1.val+temp2.val;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        return maxSum;
    }
}
