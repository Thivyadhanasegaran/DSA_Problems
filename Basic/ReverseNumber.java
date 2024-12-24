/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author thivya
 */
// Write a code to reverse a number
public class ReverseNumber {

    public static void main(String[] args) {
//    Scanner scanner = new Scanner();
//   int input = scanner.nextInt();
        int input = 123;
        int revInput = reverseNumber(input);
        System.out.println("The reveresed input is : " + revInput);

    }

    public static int reverseNumber(int input) {
        int reverseNumber = 0;
        while (input != 0) {
            int digit = input % 10;

            reverseNumber = reverseNumber * 10 + digit;
            input = input / 10;
        }
        return reverseNumber;
    }
}
