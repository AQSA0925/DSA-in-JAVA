public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode tempA = headA;

        //finding the length for both LL;

        while(tempA != null){
            tempA = tempA.next;
            lenA++;
        }
        int lenB = 0;
        ListNode tempB = headB;
         while(tempB != null){
            tempB = tempB.next;
            lenB++;
        }
       //Ab wapis se tempA & tempB ko head pr le aao;
       tempA = headA;
       tempB = headB;

        //ab dono me se jiski bhi length zada hai usko phale kam wale ki length jitna kerlo ;
       if(lenA > lenB){
        for(int i=1; i<=lenA - lenB; i++){
            tempA = tempA.next;
        }
       }else{ // (lenB> lenA)
           for(int i=1; i<=lenB-lenA; i++){
            tempB = tempB.next;
           }
       }
       while(tempA != tempB){
           tempA = tempA.next;
           tempB = tempB.next;
       }
       return tempA;
    }
}