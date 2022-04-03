package com.myastrebov.leetcode.linkedlist;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = sizeOfList(head);

        ListNode previous = null;
        ListNode node = head;
        int i = size - n;
        while (i > 0) {
            previous = node;
            node = node.next;
            i--;
        }

        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        } else if (previous != null) {
//            last element
            previous.next = previous.next.next;
        } else {
//            single element list
            return null;
        }

        return head;
    }

    private int sizeOfList(ListNode head) {
        int size = 1;
        while (head.next != null) {
            head = head.next;
            size++;
        }
        return size;
    }
}
