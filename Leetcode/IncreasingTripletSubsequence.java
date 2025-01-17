/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you implement a solution that runs in O(n) time complexity and O(1) space complexity?
* 
* Reference: https://www.youtube.com/watch?v=3QcLXN9NmW4
 */
public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;  // Smallest value found so far
        int mid = Integer.MAX_VALUE; // Second smallest value found so far

        for (int num : nums) {
            if (num <= min) {
                // Update the smallest value
                min = num;
            } else if (num <= mid) {
                // Update the second smallest value
                mid = num;
            } else {
                // Found a value greater than both `min` and `mid`
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Test case 1: " + increasingTriplet(nums1)); // Expected: true

        // Test case 2
        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Test case 2: " + increasingTriplet(nums2)); // Expected: false

        // Test case 3
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println("Test case 3: " + increasingTriplet(nums3)); // Expected: true

        // Test case 4
        int[] nums4 = {1, 1, 1, 1, 1};
        System.out.println("Test case 4: " + increasingTriplet(nums4)); // Expected: false

        // Test case 5
        int[] nums5 = {10, 2, 6, 4, 8};
        System.out.println("Test case 5: " + increasingTriplet(nums5)); // Expected: true
    }
    
    
    /*
     //For consecutive indices
        // for(int i=0;i<=nums.length-3;i++){
        //     if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2]){                
        //         return true;
               
        //     }
        // }
        //  return false;
    */
}
