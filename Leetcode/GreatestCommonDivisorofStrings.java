/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
* 
 */
public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        
        // Test cases
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println("GCD of strings \"" + str1 + "\" and \"" + str2 + "\": " + gcdOfStrings(str1, str2)); // Output: "ABC"

        str1 = "ABABAB";
        str2 = "ABAB";
        System.out.println("GCD of strings \"" + str1 + "\" and \"" + str2 + "\": " + gcdOfStrings(str1, str2)); // Output: "AB"

        str1 = "LEET";
        str2 = "CODE";
        System.out.println("GCD of strings \"" + str1 + "\" and \"" + str2 + "\": " + gcdOfStrings(str1, str2)); // Output: ""
    }


    public static String gcdOfStrings(String str1, String str2) {
        // Ensure the longer string is str1 for easier processing
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }

        // Base case: If both strings are equal, return the string
        if (str1.equals(str2)) {
            return str1;
        }

        // If str1 starts with str2, recursively process the remaining part of str1
        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }

        // If no common prefix exists, return an empty string
        return "";
    }

}
