/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 * }
 */

class Solution {
    public int[] findMinMax(TreeNode root) {
        int max = findMaxBST(root);
        int min = findMinBST(root);
        return new int[]{min,max};
    }
    private int findMaxBST(TreeNode root){
        while(root.right!=null){
            root = root.right;
        }
        return root.val;
    }

    private int findMinBST(TreeNode root){
        while(root.left!=null){
            root = root.left;
        }
        return root.val;
    }
}