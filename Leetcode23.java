class Solution {
    ListNode mergeTwoLists(ListNode head1, ListNode head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode i = head1;
        ListNode j = head2;
        while(i!=null && j!=null){
            if(i.val<=j.val){
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
        } else{
            temp.next = j;
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
       
        ListNode result = lists[0];
        for(int i=1; i<lists.length; i++){
            result = mergeTwoLists(result, lists[i]);
        }
        return result;
    }
}
