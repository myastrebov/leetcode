package com.myastrebov.leetcode.linkedlist;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListTestHelper {

    private LinkedListTestHelper() {
    }

    static void assertThatLinkedListWithValues(final ListNode actualHead, List<Integer> expectedValues) {
        ListNode currentNode = actualHead;
        List<Integer> actualValues = new ArrayList<>();

        while (currentNode != null) {
            actualValues.add(currentNode.val);
            currentNode = currentNode.next;
        }

        Assertions.assertEquals(expectedValues, actualValues, String.format("%s != %s", actualValues, expectedValues));

        assertNull(currentNode, "Size of actual linked list " + actualValues + " is not same as a expected " + expectedValues);
    }
}
