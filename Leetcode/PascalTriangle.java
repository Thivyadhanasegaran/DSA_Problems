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
 * Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
* 

 */
public class PascalTriangle {
     public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) return result; // Return empty result if numRows is 0

        // Initialize the first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // If only one row is needed, return the result with the first row
        if (numRows == 1) return result;

        // Generate each row starting from the second row
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1); // Get the previous row
            List<Integer> row = new ArrayList<>(); // Create a new row

            row.add(1); // First element of each row is always 1

            // Generate the elements between the first and last element
            for (int j = 0; j < i - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1)); // Add elements from the previous row
            }

            row.add(1); // Last element of each row is always 1
            result.add(row); // Add the generated row to the result
        }

        return result; // Return the completed Pascal's Triangle
    }

    public static void main(String[] args) {

        // Example usage: Generate Pascal's Triangle with 5 rows
        int numRows = 5;
        List<List<Integer>> pascalTriangle = generate(numRows);

        // Print Pascal's Triangle
        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}


/*Time complexity: O(N^2)
Space complexity:O(N)
*/