package com.myastrebov.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    private final ReverseInteger uut = new ReverseInteger();

    @Test
    void shouldReturnZeroBecauseOutsideRangeOfPositiveInt() {
        assertEquals(0, uut.reverse(1534236469));
    }

    @Test
    void shouldReturnZeroBecauseOutsideRangeOfNegativeInt() {
        assertEquals(0, uut.reverse(-1534236469));
    }

    @Test
    void shouldReversePositiveInt() {
        assertEquals(321, uut.reverse(123));
    }


    @Test
    void shouldReverseNegativeInt() {
        assertEquals(-321, uut.reverse(-123));
    }

    @Test
    void shouldNotReverseIntMIN() {
        assertEquals(0, uut.reverse(Integer.MIN_VALUE));
    }

    @Test
    void shouldNotReverseIntMAX() {
        assertEquals(0, uut.reverse(Integer.MAX_VALUE));
    }
}