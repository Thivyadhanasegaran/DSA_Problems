/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 
 * 
 * Reference: https://www.youtube.com/watch?v=9UOmXgG4h2U
 */
public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int curentSum = 0;

        int start = 0;
        int end = 0;

        while (end < nums.length) {
            curentSum += nums[end];
            end++;

            while (curentSum >= target) {          
                int currentLength = end - start;
                minLength = Math.min(minLength, currentLength);

                curentSum -= nums[start];
                start++;
            }
        }
        
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        

        // Example test case
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int result = minSubArrayLen(target, nums);
        System.out.println("The minimum length of a subarray with a sum >= " + target + " is: " + result);
    }
}
