/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a program to check whether a character is a vowel or consonant
public class VowelOrConsonant {

    public static void main(String[] args) {
        char character = 'A';
        checkFunction(character);

    }

    public static void checkFunction(char character) {

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
                || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("The given character " + "\"" + character + "\"" + " is a vowel");
        } else if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            System.out.println("The given character " + "\"" + character + "\"" + " is a consonant");
        } else {
            System.out.println("Please enter a valid character");
        }
    }
}
