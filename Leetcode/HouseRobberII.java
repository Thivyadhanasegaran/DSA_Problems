/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

Example 1:

Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
Example 2:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 3:

Input: nums = [1,2,3]
Output: 3

* 
 */
public class HouseRobberII {
    public static int rob(int[] nums) {
        if(nums.length<2)
        return nums[0];

        int[] skipFirst = new int[nums.length-1];
        int[] skipLast = new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++){
            skipFirst[i] = nums[i+1];
            skipLast[i] = nums[i];
        }

        int skipFirstLoot = RobHelper(skipFirst);
        int skipLastLoot = RobHelper(skipLast);

        int finalLoot = Math.max(skipFirstLoot,skipLastLoot);

        return finalLoot;
    }

    public static int RobHelper(int[] nums){
            if(nums.length<2)
            return nums[0];

            int[] dp = new int[nums.length];

            dp[0] = nums[0];
            dp[1] = Math.max(nums[0],nums[1]);

            for(int i =2;i<nums.length;i++){
                dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
            }

            return dp[nums.length-1];
    }
   

    public static void main(String[] args) {
        // Sample hardcoded input
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {1, 2, 3};

        // Test cases
        System.out.println("Max amount for nums1: " + rob(nums1)); // Output: 3
        System.out.println("Max amount for nums2: " + rob(nums2)); // Output: 4
        System.out.println("Max amount for nums3: " + rob(nums3)); // Output: 3
    }
}
