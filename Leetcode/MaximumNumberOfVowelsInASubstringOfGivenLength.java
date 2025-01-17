/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashSet;

/**
 *
 * @author thivya
 * 
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 
 * 
 * Reference: https://www.youtube.com/watch?v=FEXJGn19u7Y
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
     public static int maxVowels(String s, int k) {
         
         //Sliding window concept
        // Create a HashSet to store vowels for quick lookup
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        
        // Initialize variables
        int count = 0;
        int maxCount = 0;
        
        // Count vowels in the first substring of length k
        for (int i = 0; i < k; i++) {
            if (hs.contains(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;

        // Sliding window to calculate the maximum number of vowels in any substring of length k
        for (int i = k; i < s.length(); i++) {
            if (hs.contains(s.charAt(i - k))) {
                count--;
            }
            if (hs.contains(s.charAt(i))) {
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }



    public static void main(String[] args) {
   
        
        // Test cases
        String s1 = "abciiidef";
        int k1 = 3;
        System.out.println("Maximum vowels in substring of length " + k1 + ": " + maxVowels(s1, k1));
        
        String s2 = "aeiou";
        int k2 = 2;
        System.out.println("Maximum vowels in substring of length " + k2 + ": " + maxVowels(s2, k2));
        
        String s3 = "leetcode";
        int k3 = 3;
        System.out.println("Maximum vowels in substring of length " + k3 + ": " + maxVowels(s3, k3));
        
        String s4 = "rhythms";
        int k4 = 4;
        System.out.println("Maximum vowels in substring of length " + k4 + ": " + maxVowels(s4, k4));
    }
}
