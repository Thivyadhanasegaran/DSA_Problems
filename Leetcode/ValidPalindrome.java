/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 *
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama" Output: true Explanation:
 * "amanaplanacanalpanama" is a palindrome. Example 2:
 *
 * Input: s = "race a car" Output: false Explanation: "raceacar" is not a
 * palindrome. Example 3:
 *
 * Input: s = " " Output: true Explanation: s is an empty string "" after
 * removing non-alphanumeric characters. Since an empty string reads the same
 * forward and backward, it is a palindrome.
 *
 *
 */
public class ValidPalindrome {

    public static void main(String[] args) {

        // Test case 1
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + isPalindrome(s1));  // Expected: true

        // Test case 2
        String s2 = "race a car";
        System.out.println("Is palindrome: " + isPalindrome(s2));  // Expected: false

        // Test case 3
        String s3 = " ";
        System.out.println("Is palindrome: " + isPalindrome(s3));  // Expected: true
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))) {
                    start++;
                    end--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}


/*Time complexity:0(N)
Space complexity:0(1)*/