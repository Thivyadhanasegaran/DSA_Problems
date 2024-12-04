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
 * 
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
* 

 */
public class PlusOne {
    public static void main(String[] args) {
       
        // Test case 1
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        System.out.println(Arrays.toString(result1));  // Expected: [1, 2, 4]

        // Test case 2
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = plusOne(digits2);
        System.out.println(Arrays.toString(result2));  // Expected: [4, 3, 2, 2]

        // Test case 3
        int[] digits3 = {9};
        int[] result3 = plusOne(digits3);
        System.out.println(Arrays.toString(result3));  // Expected: [1, 0]

        // Additional test case
        int[] digits4 = {9, 9, 9};
        int[] result4 = plusOne(digits4);
        System.out.println(Arrays.toString(result4));  // Expected: [1, 0, 0, 0]
    }
    
    public static int[] plusOne(int[] digits) {
        // Iterate from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the digit is less than 9, increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0 and continue to handle carry over
            digits[i] = 0;
        }
        
        // If all digits were 9, create a new array with an extra leading 1
        int[] result = new int[digits.length + 1];
        result[0] = 1; // This sets the first element to 1, rest are already 0
        return result;
    }
}
