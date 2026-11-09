/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

// 1 Based Indexing 
// C1 : k=1 || return null 
// C2 : k is out of Bound || Return head
// C3 : General Case 
class Solution {
    public ListNode deleteKthNode(ListNode head, int k) {
        // Your code goes here

        if(head==null) return null;

        // Case 1 
        if(k==1) return head.next;

        // General Case
        ListNode curr = head;
        ListNode prev = null;
        for(int i=1;i<k && curr!=null;i++){
            prev = curr;
            curr = curr.next;
        }
        if(curr==null) return head; // Out of Bound 

        prev.next = curr.next; // Skipping that element

        return head;
    }
}