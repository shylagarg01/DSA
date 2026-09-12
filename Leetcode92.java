class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        if(left==right){
            return head;
        }
        // ListNode list1 = head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next = head;
        for(int i=1; i<left; i++){
            prev = prev.next;
        }
        ListNode list1End = prev;
        ListNode list2 = prev.next;
        prev.next = null;
        ListNode temp = list2;
        for(int i=0; i<right-left; i++){
            temp = temp.next;
        }
        ListNode list2End = temp;
        ListNode list3 = temp.next;
        temp.next = null;
        prev = null;
        ListNode curr = list2;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode revHead = prev;
        temp = revHead;
        while(temp.next!=null){
            temp = temp.next;
        }
        ListNode revEnd = temp;

        list1End.next = revHead;
        revEnd.next = list3;

        return dummy.next;

    }
}
