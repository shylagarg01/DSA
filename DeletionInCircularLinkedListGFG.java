class Solution {
    Node deleteNode(Node head, int key) {
        // code here
        if(head==null){
            return null;
        }
        if(head.next==head){
            if(head.data==key){
                return null;
            } else{
                return head;
            }
        }
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = null;
        
        if(head.data == key){
            head = head.next;
            temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = head;
            return head;
        }
        
        Node dummy = new Node(0);
        dummy.next = head;
        temp = dummy;
        while(temp.next!=null){
            if(temp.next.data==key){
                temp.next = temp.next.next;
                break;
            } else{
                temp = temp.next;
            }
        }
        Node newHead = dummy.next;
        temp = newHead;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newHead;
        return newHead;
    }
}
