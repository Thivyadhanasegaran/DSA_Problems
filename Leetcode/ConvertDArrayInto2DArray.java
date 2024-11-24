/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.

The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.

Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.

 

Example 1:


Input: original = [1,2,3,4], m = 2, n = 2
Output: [[1,2],[3,4]]
Explanation: The constructed 2D array should contain 2 rows and 2 columns.
The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.
The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.
Example 2:

Input: original = [1,2,3], m = 1, n = 3
Output: [[1,2,3]]
Explanation: The constructed 2D array should contain 1 row and 3 columns.
Put all three elements in original into the first row of the constructed 2D array.
Example 3:

Input: original = [1,2], m = 1, n = 1
Output: []
Explanation: There are 2 elements in original.
It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D array.
 */
public class ConvertDArrayInto2DArray {
    public static void main(String[] args) {
      
        // Example 1: Normal case
        int[] original1 = {1, 2, 3, 4, 5, 6};
        int m1 = 2;
        int n1 = 3;
        int[][] result1 = construct2DArray(original1, m1, n1);
        print2DArray(result1);

        // Example 2: Case where dimensions do not match
        int[] original2 = {1, 2, 3};
        int m2 = 2;
        int n2 = 3;
        int[][] result2 = construct2DArray(original2, m2, n2);
        print2DArray(result2);
    }

    // Helper method to print a 2D array
    private static void print2DArray(int[][] array) {
        if (array.length == 0) {
            System.out.println("[]");
            return;
        }

        for (int[] row : array) {
            System.out.print("[ ");
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println("]");
        }
    }


    public static int[][] construct2DArray(int[] original, int m, int n) {
        // Check if the size of the original array matches the required dimensions
        if (m * n != original.length) {
            // If not, return an empty 2D array
            return new int[0][0];
        }

        // Initialize the result 2D array
        int[][] result = new int[m][n];

        // Use a variable to keep track of the current index in the original array
        int value = 0;

        // Fill the 2D array with elements from the original array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[value];
                value++;
            }
        }

        // Return the constructed 2D array
        return result;
}
}

/*Time complexity: O(m*n)
Space complexity: O(m*n) */
