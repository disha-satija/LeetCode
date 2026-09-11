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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(-1);
       ListNode curr = dummy;

       ListNode temp1 = l1;
       ListNode temp2 = l2;

       int carry = 0;

       while(temp1 != null || temp2 != null)
       {
        int val1 = 0;
        int val2 = 0;

        if(temp1 != null)
        {
            val1 = temp1.val;
            temp1 = temp1.next;
        }

        if(temp2 != null)
        {
            val2 = temp2.val;
            temp2 = temp2.next;
        }

        int sum = val1 + val2 + carry;

        int digit = sum % 10;
        carry = sum / 10;

        curr.next = new ListNode(digit);
        curr = curr.next;

       }

       if(carry > 0)
       {
        curr.next = new ListNode(carry);
       }

       return dummy.next;
    }
}