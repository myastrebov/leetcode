package com.myastrebov.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
//         copy to map
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer previous = map.put(nums[i], i);
            if (previous != null) {
                if (nums[i] + nums[i] == target) {
                    return new int[]{i, previous};
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            Integer another = map.get(target - nums[i]);
            if (another != null && i != another) {
                return new int[]{i, another};
            }
        }
        return new int[2];
    }

}
