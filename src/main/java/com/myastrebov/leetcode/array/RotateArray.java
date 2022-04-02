package com.myastrebov.leetcode.array;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {

    public void rotate(int[] nums, int step) {
        step = step % nums.length;
        if (step == 0) {
            return;
        }

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, step - 1);
        reverse(nums, step, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int right = nums[end];
            nums[end--] = nums[start];
            nums[start++] = right;
        }
    }

}
