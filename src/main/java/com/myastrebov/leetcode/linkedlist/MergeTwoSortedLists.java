package com.myastrebov.leetcode.linkedlist;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode current = null;
        while (list1 != null || list2 != null) {
            ListNode result = compare(list1, list2);
            if (result != null) {
                if (result == list1) {
                    list1 = list1.next;
                } else {
                    list2 = list2.next;
                }
            }
            if (head != null) {
                current.next = result;
                current = result;
            } else {
                head = result;
                current = result;
            }
        }

        return head;
    }

    private ListNode compare(ListNode first, ListNode second) {
        if (first == null && second == null) {
            return null;
        } else if (first != null && second != null) {
            return first.val < second.val ? first : second;
        } else {
            return first != null ? first : second;
        }
    }
}
