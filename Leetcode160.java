public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int sizeA = 0;
        while(tempA!=null){
            tempA = tempA.next;
            sizeA++;
        }
        tempA = headA;

        int sizeB = 0;
        while(tempB!=null){
            tempB = tempB.next;
            sizeB++;
        }
        tempB = headB;
        
        if(sizeA>sizeB){
            for(int i=0; i<sizeA-sizeB; i++){
                tempA = tempA.next;
            }
        } else{
            for(int i=0; i<sizeB-sizeA; i++){
                tempB = tempB.next;
            }
        }

        while(tempA!=null && tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}

