/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Given an array of strings strs, group the 
anagrams
 together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]


 */
public class GroupAnagrams {
    
     public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<String, List<String>> mp = new HashMap<>();

        for (String str : strs) {
            String frq = frqFunction(str);

            if (mp.containsKey(frq)) {
                mp.get(frq).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                mp.put(frq, list);
            }
        }

        return new ArrayList<>(mp.values());
    }

    public static String frqFunction(String str) {
        int[] arr = new int[26];

        for (char c : str.toCharArray()) {
            arr[c - 'a']++;
        }

        StringBuilder b = new StringBuilder();
        char c = 'a';
        for (int i : arr) {
            b.append(c);
            b.append(i);
            c++;
        }

        return b.toString();
    }

    public static void main(String[] args) {

        // Test case 1
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result1 = groupAnagrams(input1);
        System.out.println("Test Case 1: " + result1);

        // Test case 2
        String[] input2 = {"a"};
        List<List<String>> result2 = groupAnagrams(input2);
        System.out.println("Test Case 2: " + result2);

        // Test case 3
        String[] input3 = {"", "b", "bb", ""};
        List<List<String>> result3 = groupAnagrams(input3);
        System.out.println("Test Case 3: " + result3);
    }
    
}
