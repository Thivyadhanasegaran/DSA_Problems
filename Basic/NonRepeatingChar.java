/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thivya
 */
// Find non-repeating characters in a string
public class NonRepeatingChar {

    public static void main(String[] args) {
        String input = "Thivyaaa";
        freqCharacter(input.toLowerCase());
    }

    public static void freqCharacter(String input) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char a : input.toCharArray()) {
            if (map.get(a) == null) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        map.forEach((c, i)
                -> System.out.println("Occurence of " + c + " is: " + i)
        );
        for (char c : map.keySet()) {

            if (map.get(c) == 1) {

                System.out.println("The non repeating char in " + input + " is " + c);
            }
        }
    }
}
