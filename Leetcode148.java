class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHead = slow.next;
        slow.next = null;
        ListNode head1 = sortList(head);
        ListNode head2 = sortList(secondHead);

        if(head1==null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode i = head1;
        ListNode j = head2;
        while(i!=null && j!=null){
            if(i.val<j.val){
                temp.next = i;
                i = i.next;
            } else{
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }
        if(i!=null){
            temp.next = i;
        }
        if(j!=null){
            temp.next = j;
        }

        return dummy.next;
        
    }
}
