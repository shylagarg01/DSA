class Solution {
    public Pair<Node, Node> splitList(Node head) {
        // Code here
        if(head==null){
            return new Pair<>(null, null);
        }
        if(head.next==head){
            return new Pair<>(head,null);
        }
        
        Node slow = head;
        Node fast = head;
        while(fast.next!=head && fast.next.next!=head){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next.next==head){
            fast = fast.next;
        }
        Node head2 = slow.next;
        slow.next = head;
        
        fast.next = head2;
        
        return new Pair<>(head,head2);
    }
}
