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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode mid = slow;

        ListNode prev = null;
        ListNode curr = mid.next;
        mid.next = null;
        ListNode next = mid;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        ListNode ptr2 = prev;
        ListNode ptr1 = head;

        while(ptr2 != null)
        {
            ListNode next1 = ptr1.next;
            ListNode next2 = ptr2.next;
            
            ptr1.next = ptr2;
            ptr2.next = next1;

            ptr1 = next1;
            ptr2 = next2;
        }
    }
}