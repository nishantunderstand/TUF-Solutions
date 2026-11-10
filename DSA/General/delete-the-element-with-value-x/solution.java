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
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        // Prsent => Skip that element 
        // Absent => Return head
        // Possibility of that element be Head || DummyNode 

        ListNode dummyNode = new ListNode();
        dummyNode.next = head;

        ListNode curr = dummyNode;
        
        while(curr.next!=null){
            if(curr.next.data==X){
                curr.next =  curr.next.next;
                break;
            }            
            curr = curr.next;
        }

        return dummyNode.next;
    }
}