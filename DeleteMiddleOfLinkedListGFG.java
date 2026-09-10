class Solution {
    public Node deleteMid(Node head) {
        // code here
        if(head == null || head.next == null){
            return null;
        }
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;
        
        
    }
}

