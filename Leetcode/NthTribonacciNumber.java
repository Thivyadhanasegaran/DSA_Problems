/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

 

Example 1:

Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:

Input: n = 25
Output: 1389537

* 
* Reference: Video: https://www.youtube.com/watch?v=3lpNp5Ojvrw
* Code: https://leetcode.com/problems/n-th-tribonacci-number/solutions/3115908/java-c-100-faster-very-short-code-with-explanation/?envType=study-plan-v2&envId=leetcode-75
 */
public class NthTribonacciNumber {
    public static int tribonacci(int n) {
        // Handle edge cases
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        // Initialize an array to store Tribonacci numbers
        int[] num = new int[n + 1];
        num[0] = 0;
        num[1] = 1;
        num[2] = 1;

        // Calculate Tribonacci numbers
        for (int i = 3; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2] + num[i - 3];
        }

        return num[n];
    }

    // Main method for testing
    public static void main(String[] args) {
  

        // Test cases
        int n1 = 4;  // Expected: 4
        int n2 = 10; // Expected: 149
        int n3 = 25; // Expected: 1389537

        System.out.println("Tribonacci of " + n1 + ": " + tribonacci(n1));
        System.out.println("Tribonacci of " + n2 + ": " + tribonacci(n2));
        System.out.println("Tribonacci of " + n3 + ": " + tribonacci(n3));
    }
}
