class Solution {
    public void reorderList(Node head) {
        // code here
        if(head==null || head.next == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node curr = slow.next;
        slow.next = null;
        Node prev = null;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node first = head;
        Node second = prev;
        while(first!=null && second!=null){
            Node firstNext = first.next;
            Node secondNext = second.next;
            first.next = second;
            second.next = firstNext;
            first = firstNext;
            second = secondNext;
        }
    }
}
