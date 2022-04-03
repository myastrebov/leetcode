package com.myastrebov.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    private final ReverseLinkedList uut = new ReverseLinkedList();

    @Test
    void shouldReverseSingleElementList() {
        List<ListNode> listNodes = ListNode.generateLinkedList(1);
        ListNode newHead = uut.reverseList(listNodes.get(0));
        assertEquals(new ListNode(1), newHead);
    }

    @Test
    void shouldReverseList() {
        List<ListNode> listNodes = ListNode.generateLinkedList(1, 2, 3, 4, 5);
        ListNode actualHead = uut.reverseList(listNodes.get(0));

        LinkedListTestHelper.assertThatLinkedListWithValues(actualHead, asList(5, 4, 3, 2, 1));
    }

    @Test
    void shouldReverseNull() {
        assertNull(uut.reverseList(null));
    }
}