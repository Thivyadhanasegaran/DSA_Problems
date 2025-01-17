/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Arrays;

/**
 *
 * @author thivya
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 

Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000
* 
* Reference: https://neetcode.io/problems/rotate-matrix (Video+Code)
* Video: https://www.youtube.com/watch?v=Ux058jpRB9Y
 * 
 */
public class RotateImage {
    // Method to rotate the matrix 90 degrees clockwise
    public static void rotate(int[][] matrix) {
        int l = 0;  // Left boundary (starting index)
        int r = matrix.length - 1;  // Right boundary (ending index)

        // Perform the rotation layer by layer (outermost to innermost)
        while (l < r) {
            for (int i = 0; i < r - l; i++) {
                int top = l;      // Top boundary for the current layer
                int bottom = r;   // Bottom boundary for the current layer

                // Save the top-right element (this will be overwritten)
                int topRight = matrix[top][l + i];

                // Move the bottom-left to top-right
                matrix[top][l + i] = matrix[bottom - i][l];

                // Move the bottom-right to bottom-left
                matrix[bottom - i][l] = matrix[bottom][r - i];

                // Move the top-left to bottom-right
                matrix[bottom][r - i] = matrix[top + i][r];

                // Move the saved top-right element to top-left
                matrix[top + i][r] = topRight;
            }
            // Move the boundaries inward to process the next inner layer
            r--;
            l++;
        }
    }

    public static void main(String[] args) {


        // Example 1: 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original matrix 1:");
        printMatrix(matrix1);

        rotate(matrix1);

        System.out.println("\nRotated matrix 1:");
        printMatrix(matrix1);

        // Example 2: 4x4 matrix
        int[][] matrix2 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };

        System.out.println("\nOriginal matrix 2:");
        printMatrix(matrix2);

        rotate(matrix2);

        System.out.println("\nRotated matrix 2:");
        printMatrix(matrix2);
    }

    // Utility method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}


/*Time complexity:O(N^2)
Space complexity:O(1)*/