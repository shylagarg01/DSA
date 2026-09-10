class Solution {
    public Node mergeSort(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node headSecond = slow.next;
        slow.next = null;
        Node head1 = mergeSort(head);
        Node head2 = mergeSort(headSecond);
        if(head1==null){
            return head2;
        } 
        if(head2==null){
            return head1;
        }
        Node dummy = new Node(0);
        Node temp = dummy;
        Node i = head1;
        Node j = head2;
        while(i!=null && j!=null){
            if(i.data<=j.data){
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


