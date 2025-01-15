/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.

Example 1:

Input:
a = amazon
b = azonam
Output: 
1
Explanation: 
amazon can be rotated anti-clockwise by two places, which will make it as azonam.
Example 2:

Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 
0
Explanation: 
If we rotate geeksforgeeks by two place in any direction, we won't get geeksgeeksfor.

* 
* 
 */
public class StringRotatedby2Places {
    public static boolean isRotated(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Check if length is 1 (can't rotate a single character by 2 places)
        if (str1.length() == 1 || str2.length()==1) {
            return false;
        }

        int n = str1.length();

        // Rotate left by 2 places
        String leftPart1 = str1.substring(0, 2);
        String rightPart1 = str1.substring(2);
        String leftRotation = rightPart1 + leftPart1;

        // Rotate right by 2 places
        String rightPart2 = str1.substring(n - 2);
        String leftPart2 = str1.substring(0, n - 2);
        String rightRotation = rightPart2 + leftPart2;

        // Check if either rotation matches str2
        return leftRotation.equals(str2) || rightRotation.equals(str2);
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cdefab";  // Example input for rotation by 2 to the left

        if (isRotated(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1 + " by 2 places.");
        } else {
            System.out.println(str2 + " is NOT a rotation of " + str1 + " by 2 places.");
        }
    }
}
