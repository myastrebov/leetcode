package com.myastrebov.leetcode.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MoveZeroesTest {

    private final MoveZeroes uut = new MoveZeroes();

    @MethodSource("argumentsSource")
    @ParameterizedTest
    void shouldMoveZeroes(int[] initialArray, int[] expectedArray) {
        uut.moveZeroes(initialArray);
        assertArrayEquals(expectedArray, initialArray);
    }

    private static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                arguments(new int[]{0}, new int[]{0})
        );
    }

}