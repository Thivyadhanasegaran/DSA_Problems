/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
//  Find the number of occurrences of a character in a String?
public class OccuranceOfCharString {

    public static void main(String[] args) {
        String a = "Thivyaa";
        char freq = 't';
        int result = freqofcharstringFunction(a.toLowerCase(), freq);
        System.out.println("The frequency of character " + "\"" + freq + "\"" + " in " + a + " is " + result);
    }

    public static int freqofcharstringFunction(String a, char freq) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == freq) {
                count++;
            }
        }
        return count;
    }
}
