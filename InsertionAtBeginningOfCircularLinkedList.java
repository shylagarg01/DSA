
static LinkList insertBeg(LinkList head, int data) {
        // Write your code here
        if(head==null){
            LinkList newHead = new LinkList(data);
            newHead.next = newHead;
            return newHead;
        }
        if(head.next==head){
            LinkList newHead = new LinkList(data);
            newHead.next = head;
            head.next = newHead;
            return newHead;
        }
        LinkList temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        LinkList newHead = new LinkList(data);
        newHead.next = head;
        temp.next = newHead;
        return newHead;
    }
