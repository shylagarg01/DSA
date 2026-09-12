class Solution {
    public void printList(Node head) {
        // code here
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        Node temp = head.next;
        while(temp!=head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
