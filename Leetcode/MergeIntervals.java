/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
* 
* Reference: https://www.youtube.com/watch?v=dzNIPX7HY6A
 */
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // Edge case: if there is 0 or 1 interval, no need to merge
        if (intervals.length <= 1)
            return intervals;

        // Sort intervals by the start time (the first element of each interval)
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];  // Start with the first interval
        result.add(newInterval);

        for (int[] interval : intervals) {
            // If the current interval overlaps with the newInterval, merge them
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                // No overlap, add the new interval to the result and update newInterval
                newInterval = interval;
                result.add(newInterval);
            }
        }

        // Convert List<int[]> to int[][] and return
        int[][] resultArray = result.toArray(new int[result.size()][]);
        return resultArray;
    }

    public static void main(String[] args) {
   
        // Example intervals
        int[][] intervals = {{1, 4}, {2, 6}, {8, 10}, {15, 18}};

        // Merging the intervals
        int[][] mergedIntervals = merge(intervals);

        // Printing the merged intervals
        System.out.println("Merged intervals: ");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

/*Time complexity: O(NlogN)
Space complexity: O(N)
*/