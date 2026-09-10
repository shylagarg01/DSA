class Solution {
    public Node partition(Node head, int x) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        
        Node dummy1 = new Node(0);
        Node temp1 = dummy1;
        
        Node dummy2 = new Node(0);
        Node temp2 = dummy2;
        
        Node dummy3 = new Node(0);
        Node temp3 = dummy3;
        
        Node temp = head;
        
        while(temp!=null){
            if(temp.data<x){
                temp1.next = temp;
                temp1 = temp;
            } else if(temp.data == x){
                temp2.next = temp;
                temp2 = temp;
            } else{
                temp3.next = temp;
                temp3 = temp;
            }
            temp = temp.next;
        }
        
        if(dummy2.next!=null){
            temp1.next = dummy2.next;
            temp2.next = dummy3.next;
        } else{
            temp1.next = dummy3.next;
        }
        
        temp3.next = null;
        
        return dummy1.next;
    }
};
