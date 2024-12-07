/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
* 

 */
public class Subsets {
    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 3};
        
    
        List<List<Integer>> result = subsets(nums);
        
        // Printing the result
        System.out.println("Subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    // Method to generate all subsets
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Sort the array (though not strictly necessary for this problem)
        Arrays.sort(nums);
        // Start the backtracking process
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    // Helper method for backtracking
    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        // Add the current combination (or subset) to the result list
        list.add(new ArrayList<>(tempList));
        // Loop through the array to generate combinations
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]); // Include the current element
            backtrack(list, tempList, nums, i + 1); // Move to the next element
            tempList.remove(tempList.size() - 1); // Remove the last element for backtracking
        }
    }
    
}
