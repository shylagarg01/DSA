
static LinkList deleteEnd(LinkList head){
  // Write your code here
    if(head==null || head.next==head){
        return null;
    }
    if(head.next.next==head){
        head.next = head;
        return head;
    }
    LinkList temp = head;
    while(temp.next.next!=head){
        temp = temp.next;
    }
    temp.next = head;
    return head;
}
