// Striver : 892. Delete Tail of Doubly Linked List
class Solution {
    public ListNode deleteTail(ListNode head) {
        
        // Case 1: Empty LL
        if(head==null) return null;

        // Case 2 : Only 1 LL
        if(head.next==null) return null;    

        // Case 3 : General Case 
        // What if we have 1 node ??
        // Reach Tail         
        ListNode curr = head;
        ListNode prev = null;
        while(curr.next!=null){ // 1->2->3->4 || What curr will point to ?
            prev = curr;
            curr = curr.next;
        }
        
        // Delete Tail 
        // 3.next = null
        // 4.prev = NULL
        
        prev.next = null;
        curr.prev = null;

        return head;
    }
}