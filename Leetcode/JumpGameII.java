/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 1000
It's guaranteed that you can reach nums[n - 1].
* 

 * 
 */
public class JumpGameII {
    
    public static int jump(int[] nums) {
        // Initialize variables for total jumps, the destination index, the current coverage range, and the last index
        int totalJumps = 0;
        int destination = nums.length - 1;
        int coverage = 0;
        int lastIndex = 0;

        // If the array has only one element, no jumps are needed
        if (nums.length == 1) {
            return 0;
        }

        // Iterate through the array to calculate the minimum jumps
        for (int i = 0; i < nums.length; i++) {
            // Update coverage to the farthest point reachable from the current position
            coverage = Math.max(coverage, i + nums[i]);

            // If we reach the last index of the current jump range
            if (i == lastIndex) {
                // Update lastIndex to the farthest reachable index and increment the jump count
                lastIndex = coverage;
                totalJumps++;

                // If the coverage meets or exceeds the destination, return the total jumps
                if (coverage >= destination) {
                    return totalJumps;
                }
            }
        }

        // Return the total jumps calculated
        return totalJumps;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
  
        // Test cases
        int[] nums1 = {2, 3, 1, 1, 4}; // Expected: 2
        int[] nums2 = {2, 3, 0, 1, 4}; // Expected: 2

        // Output the results
        System.out.println("Minimum jumps (nums1): " + jump(nums1));
        System.out.println("Minimum jumps (nums2): " + jump(nums2));
    }
    
}


/*Time complexity: O(N)
Space complexity: O(1)
*/