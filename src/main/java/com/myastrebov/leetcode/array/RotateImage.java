package com.myastrebov.leetcode.array;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        transponse(matrix);
        // multiply by a matrix with 1 on the side diagonal
        multiply(matrix);
    }

    private void transponse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = value;
            }
        }
    }

    private void multiply(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[j][i];
                matrix[j][i] = matrix[j][matrix[j].length - 1 - i];
                matrix[j][matrix[j].length - 1 - i] = value;
            }
        }
    }

}
