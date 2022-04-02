package com.myastrebov.leetcode.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
class ContainsDuplicateTest {

    private final ContainsDuplicate uut = new ContainsDuplicate();

    @MethodSource("argumentsSource")
    @ParameterizedTest
    void shouldFindDuplicateIfExist(boolean expectedContains, int[] array) {
        assertEquals(expectedContains, uut.containsDuplicate(array));
    }

    private static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(true, new int[]{1, 2, 3, 1}),
                arguments(false, new int[]{1, 2, 3, 4}),
                arguments(true, new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}),
                arguments(true, new int[]{1, 1,}),
                arguments(false, new int[]{1}),
                arguments(false, new int[0])
        );
    }
}