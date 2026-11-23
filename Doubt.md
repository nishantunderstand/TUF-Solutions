# [891. Delete the element with value X](https://takeuforward.org/practice/dsa/delete-the-element-with-value-x)
deleteNodeWithValueX
- Can we solve this with prev and curr pointer 
- I don't want to use dummyNode Concept.

---


# [123. Minimum time taken to burn the BT from a given Node](https://takeuforward.org/practice/dsa/minimum-time-taken-to-burn-the-bt-from-a-given-node)



You can code less complex by using visited add 
instead of using contains




---

# [N Meetings In One Room](https://takeuforward.org/practice/dsa/n-meetings-in-one-room)

Is this a smart way of writting or dumb way of writting this.

PriorityQueue<Pair> minPQ = new PriorityQueue<>(
			(a,b) -> a.end==b.end?Integer.compare(a.idx,b.idx):Integer.compare(a.end,b.end)
		);
		

# [905. Deletion of the Kth element of Linked List](https://takeuforward.org/practice/dsa/deletion-of-the-kth-element-of-ll)

Cannot i use single curr to perform both 
cuur.next = curr.next.next // That's how i skip the element.



---

# [967. Insertion before the value X in Linked List](https://takeuforward.org/practice/dsa/insertion-before-the-value-x-in-ll)

- Solve by 1 pointer 
- Solve by 2 Pointer

How to decide this plan ?