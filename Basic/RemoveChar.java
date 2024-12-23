/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a code to Remove all characters from string except alphabets
public class RemoveChar {

    public static void main(String[] args) {
        String value = "@%*Thivya#$!Dhana@%)";
        String output = value.replaceAll("[^a-zA-Z]", "");
        System.out.println("Input string is: " + value);
        System.out.println("Output is: " + output);

    }
}
