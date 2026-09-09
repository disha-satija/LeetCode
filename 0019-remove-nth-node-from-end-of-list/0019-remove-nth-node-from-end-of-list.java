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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode prev = null;
       ListNode curr = head;
       ListNode next = null;

       while(curr != null)
       {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       } 

       if(n == 1)
       {
        prev = prev.next;
       }
       else
       {
        int count = 1;
        ListNode temp = prev;

        while(count < n - 1)
        {
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;
       }

       curr = prev;
       prev = null;

       while(curr != null)
       {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }

       return prev;

       
    }
}