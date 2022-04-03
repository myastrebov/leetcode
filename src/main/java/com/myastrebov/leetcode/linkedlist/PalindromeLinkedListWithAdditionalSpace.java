package com.myastrebov.leetcode.linkedlist;

import java.util.LinkedList;

/**
 * Implementation O(n) time and O(n) space
 */
public class PalindromeLinkedListWithAdditionalSpace implements PalindromeLinkedListInterface {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        LinkedList<Integer> stack = new LinkedList<>();
        while (fast != null && fast.next != null) {
            stack.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
//            skip center
            slow = slow.next;
        }

        while (slow != null) {
            Integer value = stack.pollLast();
            if (value == null || value != slow.val) {
                return false;
            } else {
                slow = slow.next;
            }
        }

        return true;
    }
}
