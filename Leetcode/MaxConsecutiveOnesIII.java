/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 


* 
* Reference: https://www.youtube.com/watch?v=vLsRew-ABVs
 */
public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        
        //Sliding window concept
        int start = 0; // Start pointer for the sliding window
        int zeroCount = 0; // Tracks the number of zeros in the current window
        int maxSize = 0; // Stores the maximum window size

        for (int end = 0; end < nums.length; end++) {
            // If the current number is zero, increase the zeroCount
            if (nums[end] == 0) {
                zeroCount++;
            }

            // If zeroCount exceeds k, shrink the window from the left
            while (zeroCount > k) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            // Calculate the current window size and update maxSize
            maxSize = Math.max(maxSize, end - start + 1);
        }

        return maxSize;
    }



    public static void main(String[] args) {
        // Hardcoded array and k value
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

     
        int result = longestOnes(nums, k);

        // Output the result
        System.out.println("The longest sequence of 1s after flipping at most " + k + " zeros is: " + result);
    }
}


/*
Time Complexity: O(n): Both start and end traverse the array once.
Space Complexity: O(1): No additional data structures are used.
*/