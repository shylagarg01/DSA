class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode t1 = l1;
        ListNode prev1 = null;
        while(t1!=null){
            ListNode next1 = t1.next;
            t1.next = prev1;
            prev1 = t1;
            t1 = next1;
        }

        ListNode t2 = l2;
        ListNode prev2 = null;
        while(t2!=null){
            ListNode next2 = t2.next;
            t2.next = prev2;
            prev2 = t2;
            t2 = next2;
        }




        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode temp1 = prev1;
        ListNode temp2 = prev2;
        int sum = 0;
        int carry = 0;
        while(temp1!=null || temp2!=null){
            sum = carry;
            if(temp1!=null){
                sum+=temp1.val;
                temp1 = temp1.next;
            }
            if(temp2!=null){
                sum+=temp2.val;
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

        ListNode ans = dummy.next;
        ListNode prev = null;
        while(ans!=null){
            ListNode next = ans.next;
            ans.next = prev;
            prev = ans;
            ans = next;
        }

        return prev;
    }
}
