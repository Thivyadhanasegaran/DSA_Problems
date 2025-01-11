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
 * You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
* 
 */
public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();

        int start = 0; 
        int end = 0;

        while (end < nums.length) {
            // Check if the next element is consecutive and within bounds
            if (end + 1 < nums.length && nums[end + 1] == nums[end] + 1) {
                end++;
            } else {
                // Single number range
                if (start == end) {
                    //ls.add(String.valueOf(nums[start]));
                         ls.add(""+nums[start]);
                         start++;
                         end++;
                } else {
                    // Range of numbers
                   ls.add(nums[start]+"->"+nums[end]);
                    end++;
                    start = end;
                }
                
            }
        }

        return ls;
    }

    public static void main(String[] args) {
 
        // Test cases
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        int[] nums2 = {1, 3, 5, 7};
        int[] nums3 = {0, 2, 3, 4, 6, 8, 9};
        int[] nums4 = {};
        int[] nums5 = {1};

        // Print results
        System.out.println("Test Case 1: " + summaryRanges(nums1)); // [0->2, 4->5, 7]
        System.out.println("Test Case 2: " + summaryRanges(nums2)); // [1, 3, 5, 7]
        System.out.println("Test Case 3: " + summaryRanges(nums3)); // [0, 2->4, 6, 8->9]
        System.out.println("Test Case 4: " + summaryRanges(nums4)); // []
        System.out.println("Test Case 5: " + summaryRanges(nums5)); // [1]
    }
}
