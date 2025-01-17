/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Arrays;

/**
 *
 * @author thivya
 * 
 * Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Note that intervals which only touch at a point are non-overlapping. For example, [1, 2] and [2, 3] are non-overlapping.

 

Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
Example 2:

Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
Example 3:

Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
* 
* Reference: Video: https://www.youtube.com/watch?v=nONCGxWoUfM
* Code: https://leetcode.com/problems/non-overlapping-intervals/solutions/5860459/greedy-approach-explanation-for-beginners-edge-cases-explained/?envType=study-plan-v2&envId=leetcode-75
 */
public class NonOverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        // Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        
        int result = 0; // Counter for the number of intervals to remove
        int prevEnd = intervals[0][1]; // Track the end of the previous interval

        // Iterate through intervals starting from the second interval
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // If intervals overlap
            if (start >= prevEnd) {
                prevEnd = end; // Update previous end if no overlap
            } else {
                result++; // Increment removal counter
                prevEnd = Math.min(prevEnd, end); // Keep the interval with the smallest end
            }
        }

        return result; // Return the number of intervals removed
    }


    public static void main(String[] args) {
     

        // Test case 1
        int[][] intervals1 = {{1,2}, {2,3}, {3,4}, {1,3}};
        System.out.println("Test Case 1: " + eraseOverlapIntervals(intervals1)); // Output: 1

        // Test case 2
        int[][] intervals2 = {{1,2}, {1,2}, {1,2}};
        System.out.println("Test Case 2: " + eraseOverlapIntervals(intervals2)); // Output: 2

        // Test case 3
        int[][] intervals3 = {{1,2}, {2,3}};
        System.out.println("Test Case 3: " + eraseOverlapIntervals(intervals3)); // Output: 0

        // Test case 4
        int[][] intervals4 = {{1,5}, {2,6}, {3,7}, {4,8}};
        System.out.println("Test Case 4: " + eraseOverlapIntervals(intervals4)); // Output: 3
    }
}
