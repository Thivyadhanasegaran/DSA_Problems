/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given an n-digit large number in form of string, check whether it is divisible by 7 or not. Print 1 if divisible by 7, otherwise 0.


Example 1:

Input: num = "8955795758"
Output: 1
Explanation: 8955795758 is divisible
by 7.
Example 2:

Input: num = "1000"
Output: 0
Explanation: 1000 is not divisible
by 7.
* 
* 
 */
public class Divisibleby7 {
    // Function to check if a number represented as a string is divisible by 7
    public static int isDivisible7(String num) {
        int remainder = 0;
        
        for (int i = 0; i < num.length(); i++) {
            int digit = remainder * 10 + (num.charAt(i) - '0');
            remainder = digit % 7;
        }
        
        if (remainder == 0) {
            return 1; // Divisible by 7
        } else {
            return 0; // Not divisible by 7
        }
    }

    public static void main(String[] args) {
 
        
        String input = "343"; // Example input
        System.out.println("Number: " + input);
        
        int result = isDivisible7(input);
        if (result == 1) {
            System.out.println(input + " is divisible by 7.");
        } else {
            System.out.println(input + " is not divisible by 7.");
        }
    }
}
