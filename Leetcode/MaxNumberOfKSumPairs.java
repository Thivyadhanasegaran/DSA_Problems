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
 * You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.

 

Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.
* 
* Reference: https://www.youtube.com/watch?v=uD1yXki53KA
 */
public class MaxNumberOfKSumPairs {
    // Method to calculate the maximum number of operations
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        // Use two pointers to find pairs that sum up to k
        while (left < right) {
            if (nums[left] + nums[right] == k) {
                count++;
                left++;
                right--;
            } else if (nums[left] + nums[right] < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    // Main method to test the maxOperations method
    public static void main(String[] args) {
      
        // Test case 1
        int[] nums1 = {1, 2, 3, 4};
        int k1 = 5;
        System.out.println("Maximum operations for nums1: " + maxOperations(nums1, k1)); // Output: 2

        // Test case 2
        int[] nums2 = {3, 1, 3, 4, 3};
        int k2 = 6;
        System.out.println("Maximum operations for nums2: " + maxOperations(nums2, k2)); // Output: 1

        // Test case 3
        int[] nums3 = {2, 2, 2, 3, 3};
        int k3 = 4;
        System.out.println("Maximum operations for nums3: " + maxOperations(nums3, k3)); // Output: 2

        // Test case 4
        int[] nums4 = {5, 1, 1, 5, 1};
        int k4 = 6;
        System.out.println("Maximum operations for nums4: " + maxOperations(nums4, k4)); // Output: 2
    }
}
