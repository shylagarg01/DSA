static LinkList deleteBeg(LinkList head){
  // Write your code here
    if(head == null || head.next==head){
        return null;
    }
    if(head.next.next == head){
        head = head.next;
        head.next = head;
        return head;
    }
    LinkList temp = head;
    while(temp.next!=head){
        temp = temp.next;
    }
    head = head.next;
    temp.next = head;
    return head;
}
