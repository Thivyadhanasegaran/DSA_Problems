/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a Program to Find the Factorial of a Number using Recursion.
public class Factorial {

    public static void main(String[] args) {
        int input = 5;
        if (input >= 0) {
            int result = factorialFunction(input);
            System.out.println("Factorial is " + result);
        } else {
            System.out.println("Please enter a valid and positive number");
        }

    }

    public static int factorialFunction(int input) {
        if (input == 1 || input == 0) {
            return 1;
        } else {
            return input * factorialFunction(input - 1);
        }

    }
}
