/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a Program to Find the Sum of Natural Numbers using Recursion.
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int number = 10;
        int result = sumFunction(number);
        System.out.println("The sum of natural numbers is " + result);
    }

    public static int sumFunction(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number + sumFunction(number - 1);
        }
    }
}
