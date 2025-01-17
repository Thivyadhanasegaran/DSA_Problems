/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 
 * 
 * Reference: https://www.youtube.com/watch?v=U6-X_QOwPcs
 */
public class NumberOfIslands {
    // Function to count the number of islands
    public static int numIslands(char[][] grid) {
        int count = 0;

        // Iterate over the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // If the current cell is land ('1'), start BFS to mark the island
                if (grid[i][j] == '1') {
                    count += 1;  // Increment island count
                    callBfs(grid, i, j);  // Call BFS to mark all land in the island
                }
            }
        }
        return count;
    }

    // Helper method to perform BFS (or DFS) and mark all connected land cells
    public static void callBfs(char[][] grid, int i, int j) {
        // Base case: If out of bounds or the cell is water ('0'), return
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }

        // Mark the current cell as visited by changing it to water ('0')
        grid[i][j] = '0';

        // Visit all 4 adjacent cells (up, down, left, right)
        callBfs(grid, i + 1, j);  // Down
        callBfs(grid, i - 1, j);  // Up
        callBfs(grid, i, j + 1);  // Right
        callBfs(grid, i, j - 1);  // Left
    }

    public static void main(String[] args) {
      

        // Example grid: 2D array where '1' represents land and '0' represents water
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        // Call the method to count the number of islands
        int numIslands = numIslands(grid);

        // Output the result
        System.out.println("Number of islands: " + numIslands);
    }
}
