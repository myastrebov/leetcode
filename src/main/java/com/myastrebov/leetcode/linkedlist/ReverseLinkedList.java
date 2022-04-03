package com.myastrebov.leetcode.linkedlist;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode previous = null;
        while (head.next != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        head.next = previous;
        return head;
    }
}
