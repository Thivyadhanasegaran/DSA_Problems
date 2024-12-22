/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a Program to Find out the Power of a Number
public class PowerOfNumber {

    public static void main(String[] args) {
        int number = 2;
        int exp = 3;
        int result = powerFunction(number, exp);
        System.out.println("The power of number " + "\"" + number + "\"" + " to exponent " + "\"" + exp + "\"" + " is: " + result);
    }

    public static int powerFunction(int number, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * number;
        }
        return result;
    }
}
