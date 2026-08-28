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
    public ListNode mergeKLists(ListNode[] lists) {
      List<Integer>list=new ArrayList<>();
      for( ListNode s:lists){
        ListNode s1=s;
        while(s1!=null){
            list.add(s1.val);
            s1=s1.next;
        }
      }  
      Collections.sort(list);
     ListNode head=null;
     ListNode tail=null;
     for(int i:list){
        ListNode n=new ListNode(i);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
     }
     return head;
    }
}