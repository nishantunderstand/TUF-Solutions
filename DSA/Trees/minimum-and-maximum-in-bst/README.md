# [Minimum and Maximum in BST](https://takeuforward.org/practice/dsa/minimum-and-maximum-in-bst)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are given the root of a Binary Search Tree (BST) containing integer values.

Your task is to find the minimum and maximum values present in the BST.

In a Binary Search Tree:

- All values in the left subtree of a node are smaller than the node's value.
- All values in the right subtree of a node are greater than the node's value.

Return the minimum and maximum values present in the BST, as a 2-element array/list, where the first element is the minimum value and the second element is the maximum value:

### Example 1:

<img src="https://static.takeuforward.org/content/1790436972_Du_S-krr.webp">

**Input:** root = [8, 3, 12, 1, 6, 10, 14]

**Output:** [1, 14]

**Explanation:** The smallest value in the BST is 1, and the largest value is 14. Therefore, the answer is [1, 14].

### Example 2:

<img src="https://static.takeuforward.org/content/1790436998_QgSY5PcH.webp">

**Input:** root = [20, 10, 30, 5, 15, 25, 40, null, 7]

**Output:** [5, 40]

**Explanation:** Following the leftmost path gives the minimum value 5, while following the rightmost path gives the maximum value 40. Therefore, the answer is [5, 40].

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= number of nodes <= 10^5
- -10^9 <= Node.val <= 10^9
- All node values are unique.
- The given tree is a valid Binary Search Tree.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
