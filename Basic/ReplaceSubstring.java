/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a code to Replace a Substring in a string
public class ReplaceSubstring {

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        String replaceText = "fox";
        String replacedBy = "cat";
        replaceSubstringFunction(input.toLowerCase(), replaceText, replacedBy);
    }

    public static void replaceSubstringFunction(String input, String replaceText, String replacedBy) {
        String output = input.replace(replaceText, replacedBy);
        System.out.println("The original text is " + "\"" + input + "\"");
        System.out.println("The replaced text is " + "\"" + output + "\"");
    }

}
