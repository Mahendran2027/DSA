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
        ListNode temp=new ListNode(0);
        ListNode shyam=temp;
        int carry=0;
        while(l1!=null ||l2!=null||carry!=0)
        {
            int d1=(l1!=null)?l1.val:0;
             int d2=(l2!=null)?l2.val:0;
             int digit=d1+d2+carry;
             int sum=digit%10;
             carry= digit/10;
             ListNode tree=new ListNode(sum);
             shyam.next=tree;
             shyam=shyam.next;
             l1 = (l1 != null) ?l1.next:null;
             l2 = (l2 != null) ?l2.next:null;

        }
        ListNode result= temp.next;
        temp.next=null;
        return result;
    }
}