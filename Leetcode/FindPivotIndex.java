/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

 

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
* 

 */
public class FindPivotIndex {
     // Method to find the pivot index
    public static int pivotIndex(int[] nums) {
        int total = 0;

        // Calculate the total sum of the array
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }

        int leftValue = 0;

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Calculate the right side sum by subtracting leftValue and the current number
            int rightValue = total - nums[i] - leftValue;

            // If left sum equals right sum, return the current index
            if (leftValue == rightValue) {
                return i;
            }

            // Update left sum to include the current number
            leftValue = leftValue + nums[i];
        }

        // Return -1 if no pivot index is found
        return -1;
    }

    // Main method to test the pivotIndex method
    public static void main(String[] args) {
 

        // Test with different arrays
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot index of nums1: " + pivotIndex(nums1)); // Output: 3

        int[] nums2 = {1, 2, 3};
        System.out.println("Pivot index of nums2: " + pivotIndex(nums2)); // Output: -1

        int[] nums3 = {2, 1, -1};
        System.out.println("Pivot index of nums3: " + pivotIndex(nums3)); // Output: 0
    }
}
