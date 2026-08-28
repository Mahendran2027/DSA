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
    public ListNode oddEvenList(ListNode head) {
     if(head==null ||head.next==null) return head;
      ListNode temp=head;
       ListNode even=head.next;
       ListNode add=even;
       while(even!=null&&even.next!=null)
       {
        temp.next=temp.next.next;
        even.next=even.next.next;
        temp = temp.next;
        even = even.next;
       }
      temp.next = add;
         return head;
    }
}