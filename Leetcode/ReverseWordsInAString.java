/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 * 
 * 
 */
public class ReverseWordsInAString {

    public static void main(String[] args) {

        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println("Reversed: \"" + reverseWords(s1) + "\""); // Output should be "blue is sky the"
        System.out.println("Reversed: \"" + reverseWords(s2) + "\""); // Output should be "world hello"
        System.out.println("Reversed: \"" + reverseWords(s3) + "\""); // Output should be "example good a"
    }

    public static String reverseWords(String s) {
        // Split the input string by one or more whitespace characters
        String[] input = s.split("\\s+");
        String output = "";
        for (int i = input.length - 1; i >= 0; i--) {
            output = output + input[i] + " ";

        }
        return output.trim();
    }

    
    
    // Use Two pointer
//     s = s.trim();
//        String[] input = s.split("\\s+");
//        int start = 0;
//        int end = input.length - 1;
//        while (start < end) {
//            String temp = input[start];
//            input[start] = input[end];
//            input[end] = temp;
//            start++;
//            end--;
//        }
//        return String.join(" ", input);
//    }
}
