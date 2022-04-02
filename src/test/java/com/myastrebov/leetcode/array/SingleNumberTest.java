package com.myastrebov.leetcode.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SingleNumberTest {

    private final SingleNumber uut = new SingleNumber();

    @MethodSource("argumentsSource")
    @ParameterizedTest
    void shouldFindSingleNumber(int expectedSingleNumber, int[] array) {
        assertEquals(expectedSingleNumber, uut.singleNumber(array));
    }

    private static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(1, new int[]{2, 2, 1}),
                arguments(4, new int[]{4, 1, 2, 1, 2}),
                arguments(1, new int[]{1})
        );
    }
}