package com.myastrebov.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock uut = new BestTimeToBuyAndSellStock();

    @Test
    void shouldBePositiveProfit() {
        assertEquals(7, uut.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void shouldNotBePositiveProfit() {
        assertEquals(0, uut.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}