/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
* 
* Reference: Video: https://www.youtube.com/watch?v=LECWOvTo-Sc
 */
public class MergeStringsAlternately {
   public static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                char a = word1.charAt(i);
                str.append(a);
            }
            if (j < word2.length()) {
                char b = word2.charAt(j);
                str.append(b);
            }

            i++;
            j++;
        }

        return str.toString();
    }


    public static void main(String[] args) {
     
        
        // Test cases
        String word1 = "abc";
        String word2 = "pqr";
        String result = mergeAlternately(word1, word2);
        System.out.println("Merged string: " + result); // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        result = mergeAlternately(word1, word2);
        System.out.println("Merged string: " + result); // Output: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        result = mergeAlternately(word1, word2);
        System.out.println("Merged string: " + result); // Output: "apbqcd"
    }

}
