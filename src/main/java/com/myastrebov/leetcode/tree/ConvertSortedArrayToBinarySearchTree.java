package com.myastrebov.leetcode.tree;

/**
 * Given an integer array nums where the elements are sorted in ascending order,
 * convert it to a height-balanced binary search tree.
 *
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees
 * of every node never differs by more than one.
 *
 * TODO: test
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildNode(nums, 0, nums.length - 1);
    }

    /**
     *   from - left border inclusive, to - right border inclusive
     */
    private TreeNode buildNode(int[] nums, int from, int to) {
        if (from > to) {
            return null;
        }

        if (from == to) {
            return new TreeNode(nums[from]);
        }

        int center = from + (to - from) / 2;
        return new TreeNode(nums[center], buildNode(nums, from, center - 1), buildNode(nums, center + 1, to));
    }
}
