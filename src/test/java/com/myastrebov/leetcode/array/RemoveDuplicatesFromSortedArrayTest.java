package com.myastrebov.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RemoveDuplicatesFromSortedArrayTest {
    
    private final RemoveDuplicatesFromSortedArray uut = new RemoveDuplicatesFromSortedArray();

    @Test
    void shouldRemoveDuplicatesFromArray() {
        int[] expectedArray = {1, 2};

        int[] array = {1, 1, 2};
        int index = uut.removeDuplicates(array);

        assertEquals(2, index);
        for (int i = 0; i < index; i++) {
            assert array[i] == expectedArray[i];
        }
    }
}