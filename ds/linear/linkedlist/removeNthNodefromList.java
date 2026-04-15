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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode start = new ListNode();
        start.next = head ;  // start point the head
        
        // create 2 pointers, slow and fast
        ListNode slow = start ;
        ListNode fast = start ;
        
        //now move fast pointer to give number times forward in list
        for(int i =1 ; i<= n ; ++i)
        {
            fast = fast.next ;
        }
        
        // as soon as fast reaches n , move both fast and slow togther
        //till fast reaches lst node
        
        while(fast.next != null)
        {
            fast = fast.next ;
            slow = slow.next ;  
        }  // now slow is at right place
        
        // now break the list , by making s->n = s -> n -> n ;
        slow.next = slow.next.next ;
        
        return start.next ; // start.next is head
        
    }
}