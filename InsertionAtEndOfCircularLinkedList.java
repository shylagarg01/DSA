static LinkList insertEnd(LinkList head, int data) {
      // Write your code here
        if(head==null){
            LinkList newHead = new LinkList(data);
            newHead.next = newHead;
            return newHead;
        }
        if(head.next==head){
            LinkList newNode = new LinkList(data);
            head.next = newNode;
            newNode.next = head;
            return head;
        }
        LinkList temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        LinkList newNode = new LinkList(data);
        temp.next = newNode;
        newNode.next = head;
        return head;
    }
