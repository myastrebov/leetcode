package com.myastrebov.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

    private final RotateImage uut = new RotateImage();


    @Test
    void shouldRotateCell() {
        int[][] array = {{1}};
        uut.rotate(array);

        assertArrayEquals(new int[][]{{1}}, array);
    }

    @Test
    void shouldRotateArray() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        uut.rotate(array);

        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        assertArrayEquals(expected, array);
    }
}