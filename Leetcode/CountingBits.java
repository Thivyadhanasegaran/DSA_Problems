/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Arrays;

/**
 *
 * @author thivya
 * 
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 

Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 

Constraints:

0 <= n <= 105
 

Follow up:

It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
* 
* 
 */
public class CountingBits {
    public static int[] countBits(int n) {
        int[] num = new int[n+1];
        num[0] = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                num[i] = num[i / 2] + 1;
            } else {
                num[i] = num[i / 2];
            }
        }

        return num;
    }

    public static void main(String[] args) {

        int n = 5; // Example input
        int[] result = countBits(n);

        System.out.println("Number of 1-bits for numbers from 0 to " + n + ": " + Arrays.toString(result));
    }
}

/*Time complexity: O(N)
Space complexity: O(1)*/