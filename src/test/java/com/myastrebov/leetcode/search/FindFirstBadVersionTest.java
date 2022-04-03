package com.myastrebov.leetcode.search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstBadVersionTest {

    private FindFirstBadVersion uut;

    @CsvSource({
            "5, 4", "5, 3", "5, 2", "5, 1"
    })
    @ParameterizedTest
    void shouldFindFirstBadVersion(int currentVersion, int firstBadVersion) {
        uut = new FindFirstBadVersion(firstBadVersion);
        assertEquals(firstBadVersion, uut.firstBadVersion(currentVersion));
    }
}