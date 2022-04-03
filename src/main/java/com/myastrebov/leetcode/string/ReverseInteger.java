package com.myastrebov.leetcode.string;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class ReverseInteger {

    public int reverse(int x) {
        if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE) {
            return 0;
        }

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -1 * x;
        }

        char[] chars = String.valueOf(x).toCharArray();
        reverse(chars);
        long longValue = Long.parseLong(new String(chars));
        if (longValue > Integer.MAX_VALUE || longValue < Integer.MIN_VALUE) {
            return 0;
        }
        return (isNegative ? -1 : 1) * (int) longValue;
    }

    private void reverse(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char value = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = value;
        }
    }
}
