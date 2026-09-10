class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node temp1 = head1;
        Node temp2 = head2;
        
        int size1 = 0;
        while(temp1!=null){
            temp1 = temp1.next;
            size1++;
        }
        temp1 = head1;
        
        int size2 = 0;
        while(temp2!=null){
            temp2 = temp2.next;
            size2++;
        }
        temp2 = head2;
        
        if(size1>size2){
            for(int i=0; i<size1-size2; i++){
                temp1 = temp1.next;
            }
        } else{
            for(int i=0; i<size2-size1; i++){
                temp2 = temp2.next;
            }
        }
        
        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}
