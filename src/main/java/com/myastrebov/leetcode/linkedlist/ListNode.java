package com.myastrebov.leetcode.linkedlist;

import java.util.Arrays;
import java.util.List;

public final class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "{" + val + '}';
    }

    /**
     * Generate singly-linked list and return list of nodes
     * @param values arrays of values
     * @return list of nodes
     */
    static List<ListNode> generateLinkedList(int... values) {
        List<ListNode> listNodes = Arrays.stream(values).mapToObj(ListNode::new).toList();
        for (int i = 0; i < listNodes.size() - 1; i++) {
            listNodes.get(i).next = listNodes.get(i + 1);
        }
        return listNodes;
    }
}
