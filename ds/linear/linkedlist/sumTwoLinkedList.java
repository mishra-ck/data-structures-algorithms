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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode dummy = new ListNode();
        ListNode temp = dummy ;
        
        int carry = 0 ;
        
        // Iterate till we have digit left in any list or carry is non-null
        while(l1 != null || l2 != null || carry == 1)
        {
            // for each iteration sum keep changes ;
            int sum = 0;
            
            if( l1 != null)
            {
                sum = sum + l1.val ;
                l1 = l1.next ;
            }
            
            if(l2 != null)
            {
                sum = sum + l2.val ;
                l2 = l2.next ;
            }
            
            sum = sum + carry ;
            carry = sum / 10 ;
            
            // creating a new ListNode object which will store the value of sum
            ListNode node = new ListNode(sum %10);
            
            temp.next  = node ;  // making temp-> next point to node
            temp = temp.next ;  // move temp to node
            
        }
        return dummy.next ;
    }
}