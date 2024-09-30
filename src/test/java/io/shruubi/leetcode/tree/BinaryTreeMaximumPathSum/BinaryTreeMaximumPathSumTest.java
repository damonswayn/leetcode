package io.shruubi.leetcode.tree.BinaryTreeMaximumPathSum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeMaximumPathSumTest {
    private BinaryTreeMaximumPathSum binaryTreeMaximumPathSum;

    @Before
    public void setUp() {
        this.binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
    }

    @Test
    public void testExampleOne() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int expected = 6;
        int result = binaryTreeMaximumPathSum.maxPathSum(root);
        assertEquals(expected, result);
    }

    @Test
    public void testExampleTwo() {
        TreeNode root = new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int expected = 42;
        int result = binaryTreeMaximumPathSum.maxPathSum(root);
        assertEquals(expected, result);
    }
}