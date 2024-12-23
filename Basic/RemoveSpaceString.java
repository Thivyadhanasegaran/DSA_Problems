/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a code to Remove space from a string
public class RemoveSpaceString {

    public static void main(String[] args) {
        String input = "Hello World! This is a sample string with spaces.";

        char[] c = input.toCharArray();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ' && c[i] != '\t') {
                sb.append(c[i]);
            }
        }
        System.out.println("Input is: " + input);
        System.out.println("Output is: " + sb);
    }
}
