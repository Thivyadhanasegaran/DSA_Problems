/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.

Two strings are called K-anagrams if both of the below conditions are true.
1. Both have same number of characters.
2. Two strings can become anagram by changing at most K characters in a string.

Example:

Input:
str1 = "fodr", str2="gork"
k = 2
Output:
1
Explanation: Can change fd to gk
Your Task:
Since this is a function problem, you don't need to take any input. Just complete the given function areKAnagrams that returns true if the strings can be turned into K-anagrams, else return false.


* 
* Reference: https://www.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1?page=1&difficulty=Easy&sortBy=submissions
 */
public class Checkiftwostringsarekanagramsornot {
    
    static boolean areKAnagrams(String s1, String s2, int k) {
       
        // If the strings have different lengths, they cannot be k-anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] arr = new int[26];

        // Count the frequency of each character in the first string
        for (char c1 : s1.toCharArray()) {
            arr[c1 - 'a']++;
        }

        // Subtract the frequency of each character in the second string
        for (char c2 : s2.toCharArray()) {
            arr[c2 - 'a']--;
        }

        int sum = 0;

        // Count the number of characters that need to be changed
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }

        // If the number of changes needed is within the allowed k changes, return true
        return sum <= k;
    }
    
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "grammar";
        int k = 3;

        boolean result = areKAnagrams(s1, s2, k);
        System.out.println("Are the strings \"" + s1 + "\" and \"" + s2 + "\" k-anagrams with k = " + k + "? " + result);
    }
}
