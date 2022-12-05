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
    public ListNode removeElements(ListNode head, int val) {
        
        //if the head is null return an empty node
        if(head == null) return head;
        
        //goes to the next node to remove whatever value is there
        head.next = removeElements(head.next, val);
        
        //if the head val == val go to the next
        //else just return the head node
        return head.val == val ? head.next : head; 
    }
}