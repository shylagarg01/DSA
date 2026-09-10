class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode i = list1;
        ListNode j = list2;
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
}
