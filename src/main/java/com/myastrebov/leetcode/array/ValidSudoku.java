package com.myastrebov.leetcode.array;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * <p>
 * Example:
 * Input: board =
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        return validateRows(board) &&
                validateColumns(board) &&
                validateSectors(board);
    }

    boolean validateRows(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] bitmap = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val == '.') {
                    continue;
                }
                int intValue = Character.getNumericValue(val);
                if (bitmap[intValue - 1]) {
                    return false;
                }
                bitmap[intValue - 1] = true;
            }
        }

        return true;
    }

    boolean validateColumns(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] bitmap = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char val = board[j][i];
                if (val == '.') {
                    continue;
                }
                int intValue = Character.getNumericValue(val);
                if (bitmap[intValue - 1]) {
                    return false;
                }
                bitmap[intValue - 1] = true;
            }
        }

        return true;
    }

    boolean validateSectors(char[][] board) {
        int[][][] sectors = new int[][][]{
                {{0, 2}, {0, 2}}, {{3, 5}, {0, 2}}, {{6, 8}, {0, 2}},
                {{0, 2}, {3, 5}}, {{3, 5}, {3, 5}}, {{6, 8}, {3, 5}},
                {{0, 2}, {6, 8}}, {{3, 5}, {6, 8}}, {{6, 8}, {6, 8}}
        };

        for (int[][] sector : sectors) {
            boolean[] bitmap = new boolean[9];
            for (int k = sector[0][0]; k <= sector[0][1]; k++) {
                for (int t = sector[1][0]; t <= sector[1][1]; t++) {
                    char val = board[k][t];
                    if (val == '.') {
                        continue;
                    }
                    int intValue = Character.getNumericValue(val);
                    if (bitmap[intValue - 1]) {
                        return false;
                    }
                    bitmap[intValue - 1] = true;
                }
            }
        }
        return true;
    }
}
