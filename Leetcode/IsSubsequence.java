/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

 */
public class IsSubsequence {
    // Method to check if s is a subsequence of t
    public static boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        int i = 0;
        int j = 0;

        // Use two pointers to traverse both strings
        while (i < s1.length && j < s2.length) {
            if (s1[i] == s2[j]) {
                i++;  // Move pointer for string s
            }
            j++;  // Always move pointer for string t
        }

        // If i has reached the end of s, it means s is a subsequence of t
        return i == s1.length;
    }

    // Main method to test the isSubsequence method
    public static void main(String[] args) {
       

        // Test case 1
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\"? " + isSubsequence(s1, t1)); // Output: true

        // Test case 2
        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println("Is \"" + s2 + "\" a subsequence of \"" + t2 + "\"? " + isSubsequence(s2, t2)); // Output: false

        // Test case 3
        String s3 = "";
        String t3 = "anystring";
        System.out.println("Is \"" + s3 + "\" a subsequence of \"" + t3 + "\"? " + isSubsequence(s3, t3)); // Output: true

        // Test case 4
        String s4 = "hello";
        String t4 = "hllleo";
        System.out.println("Is \"" + s4 + "\" a subsequence of \"" + t4 + "\"? " + isSubsequence(s4, t4)); // Output: true
    }
    }

