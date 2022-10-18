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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        /*test-cases 
1 - 3 - 5
2 - 4 - 6  -> 1 2 3 4 5 6
    
1
null -> 1
    
2 - 5 
1 - 7 - 10 -> 1 2 5 7 10
    
M = linked list 

P =
dummy head + two-pointer
create a dummyhead that would be a placeholder. Create two pointers that each point to head of two linked lists. Compare each element of the linked list to see if it's less than or equal to one another. Which ever value is less, it will be added to the dummyhead placement. 
        
create a dummy node and set the pointer to the dummy

iterate through each of the lists at the same time

whatever value is less than the other, set the dummy next to that value

traverse the list */
        
        ListNode dummy = new ListNode(0, null);
        
        ListNode pointer = dummy;
        
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                pointer.next = list1;
                list1 = list1.next;
            }else{
                pointer.next = list2;
                list2 = list2.next;
            }
            
            //need to traverse pointer
            pointer = pointer.next; 
        }
        
        //if one of the lists are null
        if(list1 != null){
            pointer.next = list1;
            list1 = list1.next;
        }
        
        if(list2 != null){
            pointer.next = list2;
            list2 = list2.next;
        }
        
        return dummy.next; 
        
    }
}