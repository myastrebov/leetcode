package com.myastrebov.leetcode.tree;


/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 * - The left subtree of a node contains only nodes with keys less than the node's key.
 * - The right subtree of a node contains only nodes with keys greater than the node's key.
 * - Both the left and right subtrees must also be binary search trees.
 *
 * TODO: test
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isValidNode(root.left, null, root.val) && isValidNode(root.right, root.val, null);
    }

    private boolean isValidNode(TreeNode node, Integer left, Integer right) {
        return node == null || ((left == null || left < node.val) && (right == null || node.val < right)
                && isValidNode(node.left, left, node.val)
                && isValidNode(node.right, node.val, right));
    }
}
