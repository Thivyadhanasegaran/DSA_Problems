/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
* 

 */
public class JumpGame {
    // Function to determine if you can jump to the last index
    public static boolean canJump(int[] nums) {
        // Set the finalPosition to the last index of the array
        int finalPosition = nums.length - 1;

        // Traverse the array from the second last element to the first
        for (int i = nums.length - 2; i >= 0; i--) {
            // Check if the current index i can reach or surpass the finalPosition
            if (i + nums[i] >= finalPosition) {
                // Update finalPosition to the current index
                finalPosition = i;
            }
        }

        // If finalPosition is 0, we can reach the end from the start
        return finalPosition == 0;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
    
        // Test cases
        int[] nums1 = {2, 3, 1, 1, 4}; // Expected: true
        int[] nums2 = {3, 2, 1, 0, 4}; // Expected: false

        // Output the results
        System.out.println("Can jump (nums1): " + canJump(nums1));
        System.out.println("Can jump (nums2): " + canJump(nums2));
    }
}


/*Time complexity: O(N)
Space complexity:O(1)
*/