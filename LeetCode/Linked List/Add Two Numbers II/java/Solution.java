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
         ListNode ans=srt(l1,l2);
         return ans;        
    }
    public ListNode srt(ListNode l1,ListNode l2)
    {
        Stack<Integer>list1=new Stack<>();
        Stack<Integer>list2=new Stack<>();
        while(l1!=null)
        {
            list1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null)
        {
            list2.push(l2.val);
            l2=l2.next;
        }
        ListNode result=null;
        int carry=0;
        while(!list1.isEmpty()||!list2.isEmpty()||carry!=0)
        {
            int a=0;
            int b=0;
           if(!list1.isEmpty())
           {
              a=list1.pop();
           }
           if(!list2.isEmpty())
           {
            b=list2.pop();
           }
           int sum=a+b+carry;
           int digit=sum%10;
           carry=sum/10;
           ListNode newNode =new ListNode(digit);
           newNode.next=result;
           result=newNode;
        }
        return result;
    }
}