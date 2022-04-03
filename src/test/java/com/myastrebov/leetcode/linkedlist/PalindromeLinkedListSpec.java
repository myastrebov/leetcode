package com.myastrebov.leetcode.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.myastrebov.leetcode.linkedlist.ListNode.generateLinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.params.provider.Arguments.arguments;

interface PalindromeLinkedListSpec {

    PalindromeLinkedListInterface getUUT();

    @MethodSource("argumentsSource")
    @ParameterizedTest(name = "#{index} - {0} is palindrome? - {1}")
    default void shouldDefinePalindrome(List<ListNode> nodes, boolean isPalindrome) {
        assertEquals(isPalindrome, getUUT().isPalindrome(nodes.get(0)));
    }

    @DisplayName("#{index} - null is not palindrome")
    @Test
    default void shouldDefinePalindromeForNull() {
        assertFalse(getUUT().isPalindrome(null));
    }

    static Stream<Arguments> argumentsSource() {
        return Stream.of(
                arguments(generateLinkedList(1, 2, 3, 4, 5), false),
                arguments(generateLinkedList(1, 2, 3, 2, 1), true),
                arguments(generateLinkedList(1, 2, 2, 1), true),
                arguments(generateLinkedList(1, 1, 2, 2), false),
                arguments(generateLinkedList(1), true),
                arguments(generateLinkedList(1, 1), true),
                arguments(generateLinkedList(1, 1, 2), false)
        );
    }
}