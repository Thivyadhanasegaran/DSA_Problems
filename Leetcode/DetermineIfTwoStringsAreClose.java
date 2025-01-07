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
 * Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

 

Example 1:

Input: word1 = "abc", word2 = "bca"
Output: true
Explanation: You can attain word2 from word1 in 2 operations.
Apply Operation 1: "abc" -> "acb"
Apply Operation 1: "acb" -> "bca"
Example 2:

Input: word1 = "a", word2 = "aa"
Output: false
Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
Example 3:

Input: word1 = "cabbba", word2 = "abbccc"
Output: true
Explanation: You can attain word2 from word1 in 3 operations.
Apply Operation 1: "cabbba" -> "caabbb"
Apply Operation 2: "caabbb" -> "baaccc"
Apply Operation 2: "baaccc" -> "abbccc"
* 
 */
public class DetermineIfTwoStringsAreClose {
     public static boolean closeStrings(String word1, String word2) {
        // If the lengths of the two words are not equal, they cannot be close
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count frequencies of each character in word1
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }

        // Count frequencies of each character in word2 and check if all characters in word2 exist in word1
        for (char c : word2.toCharArray()) {
            if (freq1[c - 'a'] == 0) {
                return false; // Character in word2 is not in word1
            }
            freq2[c - 'a']++;
        }

        // Sort frequency arrays
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Compare sorted frequency arrays
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // Mismatched frequencies
            }
        }

        return true;
    }



    public static void main(String[] args) {
    

        // Test Case 1: Close strings
        String word1_1 = "abc";
        String word2_1 = "bca";
        System.out.println("Test Case 1: " + closeStrings(word1_1, word2_1)); // Expected output: true

        // Test Case 2: Not close strings
        String word1_2 = "a";
        String word2_2 = "aa";
        System.out.println("Test Case 2: " + closeStrings(word1_2, word2_2)); // Expected output: false

        // Test Case 3: Not close due to differing characters
        String word1_3 = "cabbba";
        String word2_3 = "aabbcc";
        System.out.println("Test Case 3: " + closeStrings(word1_3, word2_3)); // Expected output: false

        // Test Case 4: Close strings with repeated characters
        String word1_4 = "aaabbbbccddeeeee";
        String word2_4 = "aaaaabbcccdddeeee";
        System.out.println("Test Case 4: " + closeStrings(word1_4, word2_4)); // Expected output: true

        // Test Case 5: Completely different strings
        String word1_5 = "abc";
        String word2_5 = "xyz";
        System.out.println("Test Case 5: " + closeStrings(word1_5, word2_5)); // Expected output: false
    }
}
