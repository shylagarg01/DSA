class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode i = head;
        while(i!=null){
            if(i.next!=null && i.val == i.next.val){
                int duplicate = i.val;
                ListNode j = i;
                while(j!=null && j.val == duplicate){
                    j = j.next;
                }
                i = j;
                temp.next = i;
            }
            else{
                temp.next = i;
                temp = i;
                i = i.next;
            }
        }
        return dummy.next;
    }
}
