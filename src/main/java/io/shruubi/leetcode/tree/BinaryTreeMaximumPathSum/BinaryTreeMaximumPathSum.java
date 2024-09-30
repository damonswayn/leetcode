package io.shruubi.leetcode.tree.BinaryTreeMaximumPathSum;

/**
 * 124. Binary Tree Maximum Path Sum
 * <a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/">Binary Tree Maximum Path Sum</a>
 */
public class BinaryTreeMaximumPathSum {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        sumSubTree(root);
        return this.maxSum;
    }

    private int sumSubTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, sumSubTree(root.left));
        int right = Math.max(0, sumSubTree(root.right));

        this.maxSum = Math.max(this.maxSum, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
