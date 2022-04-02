package com.myastrebov.leetcode.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class IntersectionOfTwoArraysTest {

    private final IntersectionOfTwoArrays uut = new IntersectionOfTwoArrays();

    @MethodSource("argumentsSource")
    @ParameterizedTest
    void shouldFindIntersection(int[] nums1, int[] nums2, int[] expectation) {
        assertArrayEquals(expectation, uut.intersect(nums1, nums2));
    }

    private static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(new int[]{2, 2}, new int[]{1, 2, 2, 1}, new int[]{2, 2}),
                arguments(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{4, 9}),
                arguments(new int[]{1}, new int[]{1}, new int[]{1})
        );
    }
}