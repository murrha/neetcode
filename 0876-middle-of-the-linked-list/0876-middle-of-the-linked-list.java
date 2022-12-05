/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        //two pointers to point to the head
        ListNode fast = head;
        ListNode slow = head;
        
        //used to make sure we are at the end
        //also to check if there is only one node
        while(fast != null && fast.next != null){
            
            //slow is evaluated first in order to get the second middle node
            slow = slow.next;
            
            //fast to traverse
            fast = fast.next.next;
        }
        
        return slow; 
    }
}