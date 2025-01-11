/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.

 

Example 1:


Input: m = 3, n = 7
Output: 28
Example 2:

Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
* 

 */
public class UniquePaths {
     public static int uniquePaths(int m, int n) {
        // Create a 2D grid to store the number of unique paths
        int[][] grid = new int[m][n];

        // Iterate through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // First row and first column can only be reached in one way
                if (i == 0 || j == 0) {
                    grid[i][j] = 1;
                } else {
                    // Sum of the paths from the top and left cells
                    grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
                }
            }
        }

        // Return the number of unique paths to the bottom-right corner
        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {


        // Test cases
        int m1 = 3, n1 = 7; // Expected output: 28
        int m2 = 3, n2 = 2; // Expected output: 3

        System.out.println("Unique Paths (3x7 grid): " + uniquePaths(m1, n1));
        System.out.println("Unique Paths (3x2 grid): " + uniquePaths(m2, n2));
    }
}


/*Time complexity:O(M*N)
Space complexity:O(M*N)
*/