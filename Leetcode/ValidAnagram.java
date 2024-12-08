/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Arrays;

/**
 *
 * @author thivya
 */
//How to find out if the given two strings are anagrams or not?
//Anagrams are words or phrases formed by rearranging the letters 
//of another word or phrase, using all the original letters exactly once.


public class ValidAnagram {

    public static void main(String[] args) {
        String a = "Listen";
        String b = "Silent";
        boolean status = anagramFunction(a, b);
        if (status == true) {
            System.out.println("The given strings are anagrams");
        } else {
            System.out.println("The given strings are not anagrams");
        }
    }

//Time Complexity: O(NlogN);
//Space Complexity: O(N); 
//    public static boolean anagramFunction(String a, String b) {
//        int lengthA = a.length();
//        int lengthB = b.length();
//        if (lengthA == lengthB) {
//            char[] arrayA = a.toLowerCase().toCharArray();
//            char[] arrayB = b.toLowerCase().toCharArray();
//
//            Arrays.sort(arrayA);
//            Arrays.sort(arrayB);
//
//            if (Arrays.equals(arrayA, arrayB)) {
//                return true;
//            } else {
//                return false;
//            }
//
//        } else {
//            return false;
//        }
//    }
    
//Time Complexity: O(N)
//Space Complexity: O(1)
    
    public static boolean anagramFunction(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }
        
        // Convert strings to lowercase to handle case insensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }
        for (int j = 0; j < count.length; j++) {
            if (count[j] != 0) {
                return false;
            }
        }
        return true;
    }

}
