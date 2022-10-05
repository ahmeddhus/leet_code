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
    public ListNode middleNode(ListNode head) {
        if (head.next == null)
            return head;

        HashMap<Integer, ListNode> nodeMap = new HashMap<Integer, ListNode>();
        int index = 1;

        while (head != null) {
            nodeMap.put(index, head);
            head = head.next;
            index++;
        }
        index--;

        int middleIndex = (index / 2) + 1;

        return nodeMap.get(middleIndex);
    }
}