package com.myastrebov.leetcode.linkedlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.myastrebov.leetcode.linkedlist.LinkedListTestHelper.assertThatLinkedListWithValues;
import static com.myastrebov.leetcode.linkedlist.ListNode.generateLinkedList;
import static java.util.Arrays.asList;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists uut = new MergeTwoSortedLists();

    @MethodSource("argumentsSource")
    @ParameterizedTest(name = "#{index} - Should merge {0} with {1} and expected values {2}")
    void shouldMergeTwoLists(ListNode firstHead, ListNode secondHead, List<Integer> expectedValues) {
        ListNode actualHead = uut.mergeTwoLists(firstHead, secondHead);
        assertThatLinkedListWithValues(actualHead, expectedValues);
    }

    private static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(
                        generateLinkedList(1, 3, 5, 7, 9).get(0),
                        generateLinkedList(2, 4, 6, 8, 10).get(0),
                        asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                ),
                arguments(
                        generateLinkedList(2, 4, 6, 8, 10).get(0),
                        generateLinkedList(1, 3, 5, 7, 9).get(0),
                        asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                )
        );
    }
}