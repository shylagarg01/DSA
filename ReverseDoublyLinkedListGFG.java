class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node prev = null;
        Node temp = head;
        while(temp!=null){
            Node next = temp.next;
            temp.next = prev;
            temp.prev = next;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}
