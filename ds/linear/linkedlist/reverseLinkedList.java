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
    public ListNode reverseList(ListNode head) 
    {
        // create a dummy node for storing reverse reference and returning 
        ListNode dummy = null ;
        
        while(head != null)
        {
            // create a node store head's next  reference
            ListNode next = head.next ;
            head.next = dummy ;  // moving head's next to dummy node(null)
            dummy = head ;  // making dummy as head 
            head = next ;   // now moving hea to next node
        }
        return dummy ;
    }
}