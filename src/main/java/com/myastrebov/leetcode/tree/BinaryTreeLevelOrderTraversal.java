package com.myastrebov.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 *
 * TODO: test
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }

        LinkedList<List<Integer>> levels = new LinkedList<>();
        levels.add(new LinkedList<>());

        LinkedList<TreeNode> currentNodes = new LinkedList<>();
        //LinkedList<TreeNode> nextNodes = new LinkedList<>();
        currentNodes.add(root);
        currentNodes.add(null);

        while(!currentNodes.isEmpty()) {
            TreeNode node = currentNodes.pollFirst();
            if (node == null) {
                if (!currentNodes.isEmpty()) {
                    levels.add(new LinkedList<>());
                    currentNodes.addLast(null);
                    continue;
                } else {
                    break;
                }

            }
            levels.getLast().add(node.val);
            if (node.left != null) {
                currentNodes.add(node.left);
            }
            if (node.right != null) {
                currentNodes.add(node.right);
            }


        }
        return levels;
    }

}
