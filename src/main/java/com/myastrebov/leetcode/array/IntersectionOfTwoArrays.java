package com.myastrebov.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays
 * and you may return the result in any order.
 */
public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>(Math.max(nums1.length, nums2.length));

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            int first = nums1[i];
            int second = nums2[j];
            if (first == second) {
                result.add(first);
                i++;
                j++;
            } else if (first > second) {
                j++;
            } else {
                i++;
            }
        }

        int[] array = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            array[k] = result.get(k);
        }
        return array;
    }

}
