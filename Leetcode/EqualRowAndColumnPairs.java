/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashMap;

/**
 *
 * @author thivya
 * 
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.

A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

 

Example 1:


Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
Output: 1
Explanation: There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]
Example 2:


Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
Output: 3
Explanation: There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]
* 
 */
public class EqualRowAndColumnPairs {
     public static int equalPairs(int[][] grid) {
        HashMap<String, Integer> rMap = new HashMap<>();
        HashMap<String, Integer> cMap = new HashMap<>();

        // Build row and column maps
        for (int i = 0; i < grid.length; i++) {
            StringBuilder rStr = new StringBuilder();
            StringBuilder cStr = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                rStr.append(grid[i][j]).append('_'); // Row representation
                cStr.append(grid[j][i]).append('_'); // Column representation
            }
            rMap.put(rStr.toString(), rMap.getOrDefault(rStr.toString(), 0) + 1);
            cMap.put(cStr.toString(), cMap.getOrDefault(cStr.toString(), 0) + 1);
        }

        // Count equal pairs
        int count = 0;
        for (String s : rMap.keySet()) {
            if (cMap.containsKey(s)) {
                count += cMap.get(s) * rMap.get(s);
            }
        }

        return count;
    }

    // Main method to test the solution
    public static void main(String[] args) {
       

        int[][] grid1 = {
            {3, 2, 1},
            {1, 7, 6},
            {2, 7, 7}
        };

        int[][] grid2 = {
            {1, 2},
            {2, 1}
        };

        System.out.println("Equal pairs in grid1: " + equalPairs(grid1)); // Expected Output: 1
        System.out.println("Equal pairs in grid2: " + equalPairs(grid2)); // Expected Output: 2
    }
}
