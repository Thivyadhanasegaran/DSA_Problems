/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
* 
* Reference: https://www.youtube.com/watch?v=56TxHMG0qhQ
 */
public class MaximumAverageSubarrayI {
    // Method to find the maximum average subarray of length k
    public static double findMaxAverage(int[] nums, int k) {
        
        //Sliding window concept
        int sum = 0;

        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        int maxSum = sum;
        int left = 0;
        int right = k;

        // Slide the window and calculate the sum of the subarrays
        while (right < nums.length) {
            sum = sum - nums[left]; // Remove the element going out of the window
            left++; // Move the left pointer

            sum = sum + nums[right]; // Add the new element coming into the window
            right++; // Move the right pointer

            maxSum = Math.max(sum, maxSum); // Update the maximum sum
        }

        // Return the maximum average by dividing maxSum by k
        return (double) maxSum / k;
    }

    // Main method to test the findMaxAverage method
    public static void main(String[] args) {
      

        // Test with different arrays
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Max average of nums1: " + findMaxAverage(nums1, k1)); // Output: 12.75

        int[] nums2 = {5, 7, 3, 4, 1, 2, 8};
        int k2 = 3;
        System.out.println("Max average of nums2: " + findMaxAverage(nums2, k2)); // Output: 5.3333

        int[] nums3 = {0, 4, 0, 3, 2};
        int k3 = 2;
        System.out.println("Max average of nums3: " + findMaxAverage(nums3, k3)); // Output: 4.0
    }
}
