/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write the code to for Armstrong number
//An Armstrong number, also known as a narcissistic number or plenary number,
//is a number that is equal to the sum of its own digits each raised to the 
//power of the number of digits.
//For example, let's take the number 153:
//The number of digits in 153 is 3.
//Each digit of 153 raised to the power of 3 is: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        int length = findLength(num);
        int result = armstrongNumberFunction(num, length);
        if (result == num) {
            System.out.println(num + " is a Armstrong number");
        } else {
            System.out.println(num + " is not a Armstrong number");
        }
    }

    public static int findLength(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num = num / 10;
        }
        return len;
    }

    public static int armstrongNumberFunction(int num, int length) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, length);
            num = num / 10;
        }
        return sum;
    }
}
