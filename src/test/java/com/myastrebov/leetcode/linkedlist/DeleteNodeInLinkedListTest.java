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

class DeleteNodeInLinkedListTest {

    private final DeleteNodeInLinkedList uut = new DeleteNodeInLinkedList();

    @MethodSource("argumentsSource")
    @ParameterizedTest(name = "#{index} - Should delete {0} node from list {1} and  expected values {2}")
    void shouldDeleteNode(int position, List<ListNode> listNodes,  List<Integer> expectedValues) {
        uut.deleteNode(listNodes.get(position));
        ListNode actualHead = position != 0 ? listNodes.get(0) : listNodes.get(1);
        assertThatLinkedListWithValues(actualHead, expectedValues);
    }

    private static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(2, generateLinkedList(4, 5, 1, 9), asList(4, 5, 9)),
                arguments(2, generateLinkedList(1, 2, 3, 4, 5), asList(1, 2, 4, 5)),
                arguments(0, generateLinkedList(1, 2, 3, 4, 5), asList(2, 3, 4, 5))
        );
    }
}