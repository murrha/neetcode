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
    public ListNode reverseList(ListNode head) {
        
        ListNode current = head;
        ListNode previous = null, next = null;
        
        while(current != null){
            
            //goes to the next list
            next = current.next;
            
            //next points back to the previous
            current.next = previous;
            
            //previous is now the new current
            previous = current;
            
            //current goes to the next
            current = next;
        }
        
        //current points to the previous - which would be null at this point 
        current = previous;
        return current; 
    }
}