/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodesSet = new HashSet<>();

        while (head != null) {
            {
                if (nodesSet.contains(head))
                    return head;

                nodesSet.add(head);
                head = head.next;
            }
        }
        return null;
    }
}