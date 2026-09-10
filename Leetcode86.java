class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode dummy1 = new ListNode(0);
        ListNode temp1 = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode temp2 = dummy2;
        ListNode temp = head;

        while(temp!=null){
            if(temp.val<x){
                temp1.next = temp;
                temp1 = temp;
                temp = temp.next;
            } else{
                temp2.next = temp;
                temp2 = temp;
                temp = temp.next;
            }
        }
        temp1.next = dummy2.next;
        temp2.next = null;
        return dummy1.next;
    }
}
