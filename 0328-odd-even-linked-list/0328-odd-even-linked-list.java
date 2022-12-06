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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null) return null; 
        
        //create three heads with an evenHead to hold the head
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; 
        
        //traverse through
        while(odd.next != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            
            even.next = odd.next;
            even = even.next;
        }
        
        //evenHead is kept at the "start" of the even list
        odd.next = evenHead;
        
        //return head because it already points to odd -> which will lead us to the list we need
        return head; 
        
        
    }
}