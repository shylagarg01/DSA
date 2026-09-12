class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int sum = 0;
        int carry = 0;
        while(temp1!=null || temp2!=null){
            sum = carry;
            if(temp1!=null){
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if(temp2!=null){
                sum += temp2.val;
                temp2 = temp2.next;
            }

            carry = sum/10;
            sum = sum%10;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        if(carry!=0){
            temp.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
