/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

 

Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
* 
* Reference: video: https://www.youtube.com/watch?v=9nXc_0mb3Zc
* Code: https://leetcode.com/problems/string-compression/solutions/2704499/string-compression-simple-approach-in-java/?envType=study-plan-v2&envId=leetcode-75
 */
public class StringCompression {
     // Method to compress the character array
    public static int compress(char[] chars) {
        int ans = 0;
        int i = 0;

        while (i < chars.length) {
            char curr = chars[i];
            int count = 0;

            // Count occurrences of the current character
            while (i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }

            // Store the character
            chars[ans] = curr;
            ans++;

            // If the count is greater than 1, store the count as well
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[ans] = c;
                    ans++;
                }
            }
        }

        return ans;
    }

    // Main method to test the compress method
    public static void main(String[] args) {
       
        // Test case 1
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length1 = compress(chars1);
        System.out.print("Compressed chars1: ");
        for (int i = 0; i < length1; i++) {
            System.out.print(chars1[i]);
        }
        System.out.println(" (Length: " + length1 + ")");

        // Test case 2
        char[] chars2 = {'a'};
        int length2 = compress(chars2);
        System.out.print("Compressed chars2: ");
        for (int i = 0; i < length2; i++) {
            System.out.print(chars2[i]);
        }
        System.out.println(" (Length: " + length2 + ")");

        // Test case 3
        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int length3 = compress(chars3);
        System.out.print("Compressed chars3: ");
        for (int i = 0; i < length3; i++) {
            System.out.print(chars3[i]);
        }
        System.out.println(" (Length: " + length3 + ")");
    }
}
