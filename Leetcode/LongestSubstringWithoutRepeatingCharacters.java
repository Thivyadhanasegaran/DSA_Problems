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
 * Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
* 

 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        int left = 0;
//
//        // Array to store the frequency of characters in the substring
//        int[] num = new int[256];
//
//        // Loop over the string with the right pointer
//        for (int right = 0; right < s.length(); right++) {
//            num[s.charAt(right)]++;
//
//            // If the character appears more than once, shrink the window from the left
//            while (num[s.charAt(right)] > 1) {
//                num[s.charAt(left)]--;
//                left++;
//            }
//
//            // Update the maxLength for the longest substring found so far
//            maxLength = Math.max(maxLength, right - left + 1);
//        }
//        return maxLength;



//Using Sliding window
    HashSet<Character> set = new HashSet<>();
        int l =0;
        int result = 0;

       for(int r=0;r<s.length();r++){
        while(set.contains(s.charAt(r))){
            set.remove(s.charAt(l));
            l++;
        }
        set.add(s.charAt(r));
        result = Math.max(result, r-l+1);
       }

       return result;
    }


    public static void main(String[] args) {
        // Sample inputs for testing
        String input1 = "abcabcbb";   // Expected output: 3 ("abc")
        String input2 = "bbbbb";      // Expected output: 1 ("b")
        String input3 = "pwwkew";     // Expected output: 3 ("wke")

        // Test case 1
        int result1 = lengthOfLongestSubstring(input1);
        System.out.println("The length of the longest substring without repeating characters in '" + input1 + "' is: " + result1);

        // Test case 2
        int result2 = lengthOfLongestSubstring(input2);
        System.out.println("The length of the longest substring without repeating characters in '" + input2 + "' is: " + result2);

        // Test case 3
        int result3 = lengthOfLongestSubstring(input3);
        System.out.println("The length of the longest substring without repeating characters in '" + input3 + "' is: " + result3);
    }
}

/*Time complexity:O(N)
Space complexity:O(1)*/