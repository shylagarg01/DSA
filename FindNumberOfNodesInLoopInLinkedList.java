
class Result {
  static int loopInList(Node head) {
    // Write your code here
      Node slow = head;
      Node fast = head;
      while(fast!=null && fast.next!=null){
          slow = slow.next;
          fast = fast.next.next;
          if(slow==fast){
              int count = 1;
              Node temp = slow.next;
              while(temp!=slow){
                  count++;
                  temp = temp.next;
              }
              return count;
          }
      }
      return 0;
    
  }
}



