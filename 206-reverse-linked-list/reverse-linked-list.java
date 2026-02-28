class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }    
        return prev;
     }
}