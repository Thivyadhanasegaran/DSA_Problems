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
// Write code to Calculate frequency of characters in a string
public class FreqOfCharString {

    public static void main(String[] args) {
        String name = "Holidayyyy";
        String input = name.toLowerCase();
        freqofcharstringfunction(input);
    }

    public static void freqofcharstringfunction(String name) {
        Map<Character, Integer> mapname = new HashMap<Character, Integer>();
        for (char c : name.toCharArray()) {
            if (mapname.get(c) == null) {
                mapname.put(c, 1);
            } else {
                mapname.put(c, mapname.get(c) + 1);
            }
        }
        mapname.forEach((c, i)
                -> System.out.println("Occurence of " + c + " is: " + i)
        );
    }
}
