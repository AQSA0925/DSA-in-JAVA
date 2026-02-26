  public class Solution {
    public ListNode detectCycle(ListNode head) {
        //baseCase : 
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        //check if cycle is present
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        //this give the node 
        if(fast != slow ) return null;
        ListNode temp = head;
        while(temp != slow){
            slow = slow.next;
            temp = temp.next;
        }
        return slow;
    }
}