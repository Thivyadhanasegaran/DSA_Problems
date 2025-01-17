/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.

 

Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.
 
 * 
 * Reference: https://www.youtube.com/watch?v=WeO_E5Q1kGw
 */
public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] minCost = new int[n + 1];

        // Base cases: Starting from step 0 or step 1 costs 0
        minCost[0] = 0;
        minCost[1] = 0;

        // Calculate minimum cost to reach each step
        for (int i = 2; i <= n; i++) {
            minCost[i] = Math.min(cost[i - 1] + minCost[i - 1], cost[i - 2] + minCost[i - 2]);
        }

        return minCost[n];
    }

    public static void main(String[] args) {
    

        // Test cases
        int[] cost1 = {10, 15, 20}; // Expected: 15
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}; // Expected: 6

        System.out.println("Minimum cost (Test case 1): " + minCostClimbingStairs(cost1));
        System.out.println("Minimum cost (Test case 2): " + minCostClimbingStairs(cost2));
    }
}


/*Time complexity: O(N)
Space complexity: O(N)
*/