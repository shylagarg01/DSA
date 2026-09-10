class Solution {
    public int cycleStart(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                Node newNode = head;
                while(newNode!=slow){
                    newNode = newNode.next;
                    slow = slow.next;
                }
                return newNode.data;
            }
        }
        return -1;
        
    }
}


