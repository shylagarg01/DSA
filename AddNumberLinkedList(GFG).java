class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        if(head1==null){
                    return head2;
                }
                if(head2==null){
                    return head1;
                }
                Node t1 = head1;
                Node prev1 = null;
                while(t1!=null){
                    Node next1 = t1.next;
                    t1.next = prev1;
                    prev1 = t1;
                    t1 = next1;
                }

                Node t2 = head2;
                Node prev2 = null;
                while(t2!=null){
                    Node next2 = t2.next;
                    t2.next = prev2;
                    prev2 = t2;
                    t2 = next2;
                }




                Node dummy = new Node(0);
                Node temp = dummy;
                Node temp1 = prev1;
                Node temp2 = prev2;
                int sum = 0;
                int carry = 0;
                while(temp1!=null || temp2!=null){
                    sum = carry;
                    if(temp1!=null){
                        sum+=temp1.data;
                        temp1 = temp1.next;
                    }
                    if(temp2!=null){
                        sum+=temp2.data;
                        temp2 = temp2.next;
                    }

                    carry = sum/10;
                    sum = sum%10;
                    temp.next = new Node(sum);
                    temp = temp.next;
                }
                if(carry!=0){
                    temp.next = new Node(carry);
                }

                Node ans = dummy.next;
                Node prev = null;
                while(ans!=null){
                    Node next = ans.next;
                    ans.next = prev;
                    prev = ans;
                    ans = next;
                }
                while(prev != null && prev.data == 0 && prev.next != null){
                    prev = prev.next;
                }

                return prev;
                
                
        
    }
}
