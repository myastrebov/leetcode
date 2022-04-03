package com.myastrebov.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList uut = new RemoveNthNodeFromEndOfList();


    @Test
    void shouldRemoveFirstNode() {
        List<ListNode> listNodes = ListNode.generateLinkedList(1, 2, 3, 4);

        ListNode actualHead = uut.removeNthFromEnd(listNodes.get(0), 4);
        assertSame(actualHead, listNodes.get(0));
        LinkedListTestHelper.assertThatLinkedListWithValues(listNodes.get(0), asList(2, 3, 4));
    }

    @Test
    void shouldRemoveLastNode() {
        List<ListNode> listNodes = ListNode.generateLinkedList(1, 2, 3, 4);

        ListNode actualHead = uut.removeNthFromEnd(listNodes.get(0), 1);
        assertSame(actualHead, listNodes.get(0));
        LinkedListTestHelper.assertThatLinkedListWithValues(listNodes.get(0), asList(1, 2, 3));
    }

    @Test
    void shouldRemoveLastFromCeneter() {
        List<ListNode> listNodes = ListNode.generateLinkedList(1, 2, 3, 4, 5);

        ListNode actualHead = uut.removeNthFromEnd(listNodes.get(0), 2);
        assertSame(actualHead, listNodes.get(0));
        LinkedListTestHelper.assertThatLinkedListWithValues(listNodes.get(0), asList(1, 2, 3, 5));
    }

    @Test
    void shouldRemoveSingleElementList() {
        List<ListNode> listNodes = ListNode.generateLinkedList(1);

        ListNode actualHead = uut.removeNthFromEnd(listNodes.get(0), 1);
        assertNull(actualHead);
    }
}