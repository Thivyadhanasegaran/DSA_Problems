/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

* 

 */
public class FindTheHighestAltitude {
     public static int largestAltitude(int[] gain) {
        int max = 0;  // Initialize max altitude as 0 (ground level)
        int gainValue = 0;  // Current altitude

        // Traverse the gain array
        for (int i = 0; i < gain.length; i++) {
            gainValue += gain[i];  // Update current altitude
            max = Math.max(max, gainValue);  // Update max altitude if current altitude is higher
        }
        return max;  // Return the highest altitude
    }


    public static void main(String[] args) {
   

        // Test Case 1: General case with positive and negative gains
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println("Test Case 1: " + largestAltitude(gain1)); // Expected output: 1

        // Test Case 2: All positive gains
        int[] gain2 = {2, 3, 1, 5};
        System.out.println("Test Case 2: " + largestAltitude(gain2)); // Expected output: 11

        // Test Case 3: All negative gains
        int[] gain3 = {-4, -3, -2, -1};
        System.out.println("Test Case 3: " + largestAltitude(gain3)); // Expected output: 0

        // Test Case 4: Mixed gains
        int[] gain4 = {1, -2, 3, -4, 5};
        System.out.println("Test Case 4: " + largestAltitude(gain4)); // Expected output: 5

        // Test Case 5: Single gain
        int[] gain5 = {10};
        System.out.println("Test Case 5: " + largestAltitude(gain5)); // Expected output: 10
    }
}
