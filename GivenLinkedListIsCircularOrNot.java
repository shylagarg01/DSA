static int isCircular(Node head) {
  // Write your code here
    if(head==null || head.next==head){
        return 1;
    }
    if(head.next==null){
        return 0;
    }
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            break;
        }
    }
    if(fast==null || fast.next==null){
        return 0;
    }
    slow = head;
    while(slow!=fast){
        slow=slow.next;
        fast = fast.next;
    }
    if(slow == head){
        return 1;
    }
    return 0;
  
}
