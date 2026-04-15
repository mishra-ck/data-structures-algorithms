//You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.

//It is guaranteed that the node to be deleted is not a tail node in the list

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node)
    {
        node.val = node.next.val ;
        node.next = node.next.next ;
        return ;
    }
}