/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a program for Binary to Decimal to conversion
public class BinaryToDecimal {

    public static void main(String[] args) {
        int value = 1011;
        int result = conversionFunction(value);

        System.out.println("The Decimal conversion of " + value + " is " + result);
    }

    public static int conversionFunction(int value) {
        int sum = 0;
        int n = 0;

        while (value != 0) {
            int digit = value % 10;
            sum = sum + (digit * (int) Math.pow(2, n));
            value = value / 10;
            n++;

        }
        return sum;
    }

}
