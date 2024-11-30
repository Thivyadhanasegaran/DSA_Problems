/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashSet;

/**
 *
 * @author thivya
 * 
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
* 
 */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int longestVal = 0;
        HashSet<Integer> set = new HashSet<>();

        // Add all numbers to a set
        for (int num : nums) {
            set.add(num);
        }

        // Find the longest consecutive sequence
        for (int num : nums) {
            // Only start counting from numbers that are the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentVal = 1;

                // Check for consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentVal++;
                }

                // Update the longest sequence found
                longestVal = Math.max(longestVal, currentVal);
            }
        }

        return longestVal;
    }

    // Main method to test the solution
    public static void main(String[] args) {

        // Test case 1
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence for nums1: " + longestConsecutive(nums1)); // Output: 4

        // Test case 2
        int[] nums2 = {0, -1, 1, 2, -2, -3};
        System.out.println("Longest Consecutive Sequence for nums2: " + longestConsecutive(nums2)); // Output: 6

        // Test case 3
        int[] nums3 = {9, 1, 4, 7, 3, 2, 6, 8, 5};
        System.out.println("Longest Consecutive Sequence for nums3: " + longestConsecutive(nums3)); // Output: 9
    }
}
