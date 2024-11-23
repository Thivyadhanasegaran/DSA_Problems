/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2 Output: 2 Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step 2. 2 steps Example 2:
 *
 * Input: n = 3 Output: 3 Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step 2. 1 step + 2 steps 3. 2 steps + 1 step
 *
 *
 *
 */
public class ClimbingStairsDP {

    public static void main(String[] args) {

        int n = 4; 
        System.out.println("Number of ways to climb " + n + " steps: " + climbStairs(n)); // Expected output: 8
    }

    public static int climbStairs(int n) {
        
    // Using DP method
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] nums = new int[n + 1];

        nums[1] = 1;
        nums[2] = 2;

        for (int i = 3; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        return nums[n];
        
        // Recursive method
        
//        if(n<0)
//            return 0;
//        else if(n==0){
//            return 1;
//        }else{
//        return climbStairs(n-1)+climbStairs(n-2);
//        }
       

    }
}
