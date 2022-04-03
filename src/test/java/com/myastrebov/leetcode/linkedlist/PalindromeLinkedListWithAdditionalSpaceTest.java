package com.myastrebov.leetcode.linkedlist;

class PalindromeLinkedListWithAdditionalSpaceTest implements PalindromeLinkedListSpec{

    @Override
    public PalindromeLinkedListInterface getUUT() {
        return new PalindromeLinkedListWithAdditionalSpace();
    }
}