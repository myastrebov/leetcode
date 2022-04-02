package com.myastrebov.leetcode.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TwoSumTest {

    private final TwoSum uut = new TwoSum();

    @MethodSource("argumentsSource")
    @ParameterizedTest
    void shouldFindElementsWithTargetSum(int target, int[] array, int[] expected) {
        assertArrayEquals(expected, uut.twoSum(array, target));
    }

    private static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(9, new int[]{2,7,11,15}, new int[]{0, 1}),
                arguments(6, new int[]{3,2,4}, new int[]{1, 2})
        );
    }

}