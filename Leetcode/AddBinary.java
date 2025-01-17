/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

* 
* Reference: Video :https://www.youtube.com/watch?v=0lqEQ_ZfXJo (for concept)
* For code: https://leetcode.com/problems/add-binary/solutions/3183205/1ms-beats-100-full-explanation-append-reverse-c-java-python3/?envType=study-plan-v2&envId=top-interview-150
 */
public class AddBinary {
    
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i) - '0'; // Add bit from string `a`
                i--;
            }

            if (j >= 0) {
                carry += b.charAt(j) - '0'; // Add bit from string `b`
                j--;
            }

            sb.append(carry % 2); // Append the current bit (0 or 1)
            carry /= 2;          // Update the carry
        }

        return sb.reverse().toString(); // Reverse and return the result
    }
    
    public static void main(String[] args) {
 
        // Test cases
        String a = "1010";
        String b = "1011";

        String result = addBinary(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }


}
