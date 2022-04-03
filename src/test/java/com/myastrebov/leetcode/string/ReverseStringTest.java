package com.myastrebov.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    private final ReverseString uut = new ReverseString();

    @Test
    void shouldReverseSingleCharacter() {
        char[] array = {'2'};

        uut.reverseString(array);
        assertArrayEquals(new char[]{'2'}, array);
    }

    @Test
    void shouldReverseCharactersOddCount() {
        char[] array = {'a', 'b', 'c'};

        uut.reverseString(array);
        assertArrayEquals(new char[]{'c', 'b', 'a'}, array);
    }

    @Test
    void shouldReverseCharactersEvenCount() {
        char[] array = {'a', 'b', 'c', 'd'};

        uut.reverseString(array);
        assertArrayEquals(new char[]{'d', 'c', 'b', 'a'}, array);
    }
}