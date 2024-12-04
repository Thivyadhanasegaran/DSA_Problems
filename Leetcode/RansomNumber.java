/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thivya Given two strings ransomNote and magazine, return true if
 * ransomNote can be constructed by using the letters from magazine and false
 * otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b" Output: false Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab" Output: false Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab" Output: true
 */
public class RansomNumber {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = ransomNumberFunction(ransomNote, magazine);
        if (result == true) {
            System.out.println("The given string ransomNote can be constructed by using the letters from magazine");
        } else {
            System.out.println("The given string ransomNote can not be constructed by using the letters from magazine");
        }

    }

    public static boolean ransomNumberFunction(String ransomNumber, String magazine) {
        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < ransomNumber.length(); i++) {
            char ch = ransomNumber.charAt(i);
            if (!mp.containsKey(ch) || mp.get(ch) <= 0) {
                return false;
            }
            mp.put(ch, mp.get(ch) - 1);
        }
        return true;
    }
}
