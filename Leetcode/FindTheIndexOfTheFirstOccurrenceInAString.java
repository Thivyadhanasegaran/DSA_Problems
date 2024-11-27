/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 *
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad" Output: 0 Explanation: "sad"
 * occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.
 * Example 2:
 *
 * Input: haystack = "leetcode", needle = "leeto" Output: -1 Explanation:
 * "leeto" did not occur in "leetcode", so we return -1.
 *
 *
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int index = fnStrStr(haystack, needle);
        System.out.println("Index of the first occurrence of needle in haystack: " + index);
    }

    public static int fnStrStr(String haystack, String needle) {

        char start = needle.charAt(0);
        int needleLength = needle.length();
        int haystackLength = haystack.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.charAt(i) == start) {
                if (haystack.substring(i, needleLength + i).equals(needle)) {
                    return i; // Return the starting index of the first occurrence
                }
            }
        }

        return -1; // Return -1 if needle is not found in haystack
    }

}
