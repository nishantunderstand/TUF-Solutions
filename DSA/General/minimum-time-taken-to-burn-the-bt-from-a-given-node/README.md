# [123. Minimum time taken to burn the BT from a given Node](https://takeuforward.org/practice/dsa/minimum-time-taken-to-burn-the-bt-from-a-given-node)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given a target node data and a root of binary tree. If the target is set on fire, determine the shortest amount of **time** needed to **burn** the entire binary tree.

It is known that in 1 second all nodes connected to a given node get burned. That is its left child, right child, and parent.

### Example 1:

**Input:** root = [1, 2, 3, 4, null, 5, 6, null, 7]. target = 1

**Output:** 3

**Explanation:** The node with value 1 is set on fire.

In 1st second it burns node 2 and node 3.

In 2nd second it burns nodes 4, 5, 6.

In 3rd second it burns node 7.

<img src="https://static.takeuforward.org/content/1789463238_3iwx_0oc.webp">

### Example 2:

**Input:** root = [1, 2, 3, null, 5, null, 4], target = 4

**Output:** 4

**Explanation:** The node with value 4 is set on fire.

In 1st second it burns node 3.

In 2nd second it burns node 1.

In 3rd second it burns node 2.

In 4th second it burns node 5.

<img src="https://static.takeuforward.org/content/1789463245_YIQgueZg.webp">

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= Number of Nodes <= 10^4
- -10^5 <= Node.val <= 10^5
- All Node.val values are **unique** .
- target will always be present in tree

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
