class Solution { 
    public void reorderList(ListNode head) { 
        if (head == null || head.next == null) return; 

        ListNode slow = head; 
        ListNode fast = head; 
        ListNode prev = null; 
            while (fast != null && fast.next != null) { 
            prev = slow; 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        prev.next = null;
        ListNode secondpart = reverseList(slow); 
        merge(head, secondpart); 
    } 

    private ListNode reverseList(ListNode temp) {  
        ListNode prev = null; 
        ListNode current = temp; 

        while (current != null) { 
            ListNode nextNode = current.next; 

            current.next = prev; 
            prev = current; 
            current = nextNode; 
        } 

        return prev; 
    } 

    private void merge(ListNode l1, ListNode l2) { 

        while (l1 != null && l2 != null) { 

           
            ListNode next1 = l1.next; 
            ListNode next2 = l2.next; 
            l1.next = l2; 
            if (next1 == null) {
                l2.next = next2;
                return;
            }
            l2.next = next1; 
             l1 = next1; 
            l2 = next2; 
        } 
    } 
}