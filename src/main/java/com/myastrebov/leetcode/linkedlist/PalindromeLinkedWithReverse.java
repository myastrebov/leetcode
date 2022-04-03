package com.myastrebov.leetcode.linkedlist;

/**
 * Implementation O(n) time and O(1) space but with modification initial structure
 */
public class PalindromeLinkedWithReverse implements PalindromeLinkedListInterface {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        ListNode reversed = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            ListNode next = head.next;
            head.next = reversed;
            reversed = head;
            head = next;
        }

        if (fast != null) {
//            skip center
            slow = slow.next;
        }

        while (slow != null || reversed != null) {
            if (slow == null || reversed == null || reversed.val != slow.val) {
                return false;
            } else {
                slow = slow.next;
                reversed = reversed.next;
            }
        }

        return true;
    }
}
