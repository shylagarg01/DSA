class Result {
  static int countNodes(Node head) {
    // Write your code here
      if(head==null){
          return 0;
      }
      if(head.next == head){
          return 1;
      }
      int count = 1;
      Node temp = head;
      while(temp.next!=head){
          temp = temp.next;
          count++;
      }
      return count;
  }
}
