/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
* 
 */
public class SpiralMatrix {
    public static void main(String[] args) {

        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Get spiral order
        List<Integer> result = spiralOrder(matrix);

        // Print the result
        System.out.println("Spiral Order: " + result);
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        if (matrix.length == 0) {
            return ls;
        }

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse from left to right
            for (int j = colStart; j <= colEnd; j++) {
                ls.add(matrix[rowStart][j]);
            }
            rowStart++;

            // Traverse from top to bottom
            for (int j = rowStart; j <= rowEnd; j++) {
                ls.add(matrix[j][colEnd]);
            }
            colEnd--;

            // Traverse from right to left, if rows remain
            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart; j--) {
                    ls.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }

            // Traverse from bottom to top, if columns remain
            if (colStart <= colEnd) {
                for (int j = rowEnd; j >= rowStart; j--) {
                    ls.add(matrix[j][colStart]);
                }
                colStart++;
            }
        }

        return ls;
    }
}

/*Time complexity: O(m*n)
Space complexity: O(1)*/