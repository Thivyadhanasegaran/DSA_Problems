/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a Program to Find out the Sum of Digits of a Number.
public class SumOfDigits {

    public static void main(String[] args) {
        int number = 123456;
        sumOfDigits(number);
    }

    public static void sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("The sum of diigts are: " + sum);
    }
}
