class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        if(head==null && head.next == null){
            return true;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node prev = null;
        Node curr = slow.next;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node revHead = prev;
        
        Node temp1 = head;
        Node temp2 = revHead;
        while(temp2!=null){
            if(temp1.data!=temp2.data){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
           
        }
        return true;
        
        
    }
}
