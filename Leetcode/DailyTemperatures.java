/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Stack;

/**
 *
 * @author thivya
 * 
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
 

 */
public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                result[i] = st.peek() - i;
            }

            st.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
 
        
        // Example input
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        
        // Call the method and print the result
        int[] result = dailyTemperatures(temperatures);
        
        System.out.println("Input Temperatures:");
        for (int temp : temperatures) {
            System.out.print(temp + " ");
        }
        System.out.println("\n\nDays to wait for warmer temperatures:");
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}

/*Time complexity: O(N)
Space complexity: O(N)
*/