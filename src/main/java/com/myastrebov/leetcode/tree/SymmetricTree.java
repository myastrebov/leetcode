package com.myastrebov.leetcode.tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * TODO: test
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root.left);
        deque.addLast(root.right);

        while(!deque.isEmpty()) {
            TreeNode left = deque.pollFirst();
            TreeNode right = deque.pollLast();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val == right.val) {
                deque.addFirst(left.right);
                deque.addFirst(left.left);
                deque.addLast(right.left);
                deque.addLast(right.right);
            } else {
                return false;
            }
        }
        return true;
    }

}
