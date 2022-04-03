package com.myastrebov.leetcode.linkedlist;

class PalindromeLinkedWithReverseTest implements PalindromeLinkedListSpec{

    @Override
    public PalindromeLinkedListInterface getUUT() {
        return new PalindromeLinkedWithReverse();
    }
}