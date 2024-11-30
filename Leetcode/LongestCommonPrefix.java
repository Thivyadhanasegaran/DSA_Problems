/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * 

 */
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        String result = fnLongestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }

    public static String fnLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return empty string if input array is null or empty
        }

        String commonPrefix = strs[0]; // Initialize with the first string

        // Compare the common prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            commonPrefix = fncommonPrefix(commonPrefix, strs[i]);

            // If the common prefix becomes empty, return immediately
            if (commonPrefix.length() == 0) {
                return "";
            }
        }
        return commonPrefix; // Return the longest common prefix
    }

    // Function to find the common prefix between two strings
    public static String fncommonPrefix(String a, String b) {

        String commonPrefix = "";
        int index = 0;
        for (char c : b.toCharArray()) {
            if (index < a.length() && a.charAt(index) == c) {
                commonPrefix = commonPrefix + c;
                index++;
            } else {
                break;
            }
        }
        return commonPrefix;
    }

}

