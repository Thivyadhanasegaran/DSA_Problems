/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

 

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
* 
* Reference: Video: https://www.youtube.com/watch?v=AmtU7Qe0QZU
 */
public class LongestSubarrayOf1sAfterDeletingOneElement {
     public static int longestSubarray(int[] nums) {
         
         //Sliding window concept
        int zeroCount = 0; // Tracks the number of zeros in the current window
        int start = 0;     // Start pointer for the sliding window
        int result = 0;    // Stores the maximum valid window size

        for (int end = 0; end < nums.length; end++) {
            // Increment zeroCount if a zero is encountered
            if (nums[end] == 0) {
                zeroCount++;
            }

            // If more than one zero exists, shrink the window from the left
            while (zeroCount > 1) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            // Update result (window size after ensuring <=1 zero in the window)
            result = Math.max(result, end - start);
        }

        return result;
    }



    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int[] nums2 = {1, 1, 0, 1};
        int[] nums3 = {1, 1, 1, 1};

        System.out.println("Test Case 1: " + longestSubarray(nums1)); // Expected Output: 5
        System.out.println("Test Case 2: " + longestSubarray(nums2)); // Expected Output: 3
        System.out.println("Test Case 3: " + longestSubarray(nums3)); // Expected Output: 3
    }
}
