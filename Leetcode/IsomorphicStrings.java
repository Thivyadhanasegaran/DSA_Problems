/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashMap;

/**
 *
 * @author thivya
 * 
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true
* 

 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replace = t.charAt(i);

            if (!map.containsKey(original)) {
                if (map.containsValue(replace)) {
                    return false;
                } else {
                    map.put(original, replace);
                }
            } else {
                char mappedChar = map.get(original);
                if (mappedChar != replace) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
      
        // Test cases
        String s1 = "egg";
        String t1 = "add";
        System.out.println("Is \"" + s1 + "\" and \"" + t1 + "\" isomorphic? " + isIsomorphic(s1, t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println("Is \"" + s2 + "\" and \"" + t2 + "\" isomorphic? " + isIsomorphic(s2, t2));

        String s3 = "paper";
        String t3 = "title";
        System.out.println("Is \"" + s3 + "\" and \"" + t3 + "\" isomorphic? " + isIsomorphic(s3, t3));

        String s4 = "abc";
        String t4 = "xyz";
        System.out.println("Is \"" + s4 + "\" and \"" + t4 + "\" isomorphic? " + isIsomorphic(s4, t4));
    }
}
