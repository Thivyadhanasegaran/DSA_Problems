/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashMap;

/**
 *
 * @author thivya Given a string s, find the first non-repeating character in it
 * and return its index. If it does not exist, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode" Output: 0 Example 2:
 *
 * Input: s = "loveleetcode" Output: 2 Example 3:
 *
 * Input: s = "aabb" Output: -1
 * 
 */
public class FirstUniqueCharInString {

    public static void main(String[] args) {
        String input = "loveleetcode";
        int index = fnFirstUniqueCharInString(input);
        System.out.println("First non-repeating character index is: " + index);
    }

    public static int fnFirstUniqueCharInString(String input) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char c : input.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            if (mp.get(input.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
