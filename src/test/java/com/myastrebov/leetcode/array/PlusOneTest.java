package com.myastrebov.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    private final PlusOne uut = new PlusOne();

    @Test
    void shouldPlusOneWithoutNewDigit() {
        int[] actual = uut.plusOne(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 4}, actual);
    }

    @Test
    void shouldPlusOneWithNewDigit() {
        int[] actual = uut.plusOne(new int[]{9, 9, 9});
        assertArrayEquals(new int[]{1, 0, 0, 0}, actual);
    }

    @Test
    void shouldPlusOne() {
        int[] actual = uut.plusOne(new int[]{1, 9, 9});
        assertArrayEquals(new int[]{2, 0, 0}, actual);
    }
}