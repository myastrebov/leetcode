package com.myastrebov.leetcode.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.myastrebov.leetcode.linkedlist.ListNode.generateLinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LinkedListCycleTest {

    private final LinkedListCycle uut = new LinkedListCycle();

    @MethodSource("argumentsSource")
    @ParameterizedTest
    void shouldDefineCycle(ListNode head, boolean cycle) {
        assertEquals(cycle, uut.hasCycle(head));
    }

    static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(createLink(generateLinkedList(1, 2, 3, 4, 5), 0), true),
                arguments(createLink(generateLinkedList(1, 2, 3, 4, 5), 1), true),
                arguments(createLink(generateLinkedList(1, 2, 3, 4, 5), 2), true),
                arguments(createLink(generateLinkedList(1, 2, 3, 4, 5), 3), true),
                arguments(createLink(generateLinkedList(1, 2, 3, 4, 5), 4), true),
                arguments(createLink(generateLinkedList(1), 0), true),
                arguments(generateLinkedList(5).get(0), false),
                arguments(generateLinkedList(1, 2).get(0), false),
                arguments(generateLinkedList(1, 2, 3, 4, 5).get(0), false)
        );
    }

    /**
     * add link in last element to i-nh of list
     * @return head
     */
    static ListNode createLink(List<ListNode> nodes, int to) {
        nodes.get(nodes.size() - 1).next = nodes.get(to);
        return nodes.get(0);
    }
}