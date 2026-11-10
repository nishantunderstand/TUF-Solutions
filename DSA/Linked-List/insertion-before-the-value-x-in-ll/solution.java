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

class Solution {
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if(head==null) return null;

        // Case 1 : First Node 
        if(head.data == X){            
            return new ListNode(val,head);
        }
        
        // Case 2 : Other Case         
        ListNode curr = head;

        // This Loop Condition need Improvement 
        while(curr.next!=null && curr.next.data!=X){
            curr = curr.next;
        }
        if(curr.next == null) return head; // ??

        ListNode newNode = new ListNode(val); // New Node
        newNode.next = curr.next; // Join
        curr.next = newNode; // Break 

        return head;
    }
}