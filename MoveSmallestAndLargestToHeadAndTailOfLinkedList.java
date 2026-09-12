static Node shiftSmallLarge(Node head) {
  // Write your code here
    if(head==null || head.next==null){
        return head;
    }
    Node temp = head;
    Node prev = null;
    Node minNode = head;
    Node maxNode = head;
    Node minPrev = null;
    Node maxPrev = null;
    while(temp!=null){
        if(temp.data<minNode.data){
            minNode = temp;
            minPrev = prev;
        }
        if(temp.data>maxNode.data){
            maxNode = temp;
            maxPrev = prev;
        }
        prev = temp;
        temp = temp.next;
    }
    if(minNode == maxNode){
        return head;
    }
    if(minPrev==null){
        head = minNode.next;
    } else{
        minPrev.next = minNode.next;
    }
    temp = head;
    prev = null;
    maxNode = head;
    maxPrev = null;
    while(temp!=null){
        if(temp.data>maxNode.data){
            maxNode = temp;
            maxPrev = prev;
        }
        prev = temp;
        temp = temp.next;
    }
    if(maxPrev==null){
        head = maxNode.next;
    } else{
        maxPrev.next = maxNode.next;
    }
    minNode.next = head;
    head = minNode;
    temp = head;
    while(temp.next!=null){
        temp = temp.next;
    }
    temp.next = maxNode;
    maxNode.next = null;
    return head;
}



