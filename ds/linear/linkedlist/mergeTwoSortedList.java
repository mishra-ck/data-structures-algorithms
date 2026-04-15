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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
       ListNode head = new ListNode();
       ListNode node = head ;
        
        while(list1 != null && list2 != null) // unless both list have nodes
        {
            if(list1.val < list2.val)
            {
                node.next = list1 ;
                node = list1 ;
                list1 = list1.next  ;
            }
            else
            {
                node.next = list2 ;
                node = list2 ;
                list2 = list2.next  ;
            }
        }
        
        // when a list have no element left then simply put all remaining elements of other
        
        if(list1 != null || list2 != null)
        {
            node.next = list1 !=null ? list1 :list2 ;
            
        }
        return head.next ;
    }
}