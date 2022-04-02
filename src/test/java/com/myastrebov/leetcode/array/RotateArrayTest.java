package com.myastrebov.leetcode.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RotateArrayTest {

    private final RotateArray uut = new RotateArray();


    @MethodSource("argumentsSource")
    @ParameterizedTest
    void shouldRotateToTheRight(int steps, int[] expectedArray) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        uut.rotate(array, steps);
        assertArrayEquals(expectedArray, array);
    }

    private static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(1, new int[]{7, 1, 2, 3, 4, 5, 6}),
                arguments(2, new int[]{6, 7, 1, 2, 3, 4, 5}),
                arguments(3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                arguments(4, new int[]{4, 5, 6, 7, 1, 2, 3}),
                arguments(5, new int[]{3, 4, 5, 6, 7, 1, 2}),
                arguments(6, new int[]{2, 3, 4, 5, 6, 7, 1}),
                arguments(7, new int[]{1, 2, 3, 4, 5, 6, 7}),
                arguments(0, new int[]{1, 2, 3, 4, 5, 6, 7})
        );
    }
}