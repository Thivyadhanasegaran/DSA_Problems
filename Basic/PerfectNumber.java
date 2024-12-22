/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write code of  Perfect number
//A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. In other words, a perfect number is a number that is half the sum of all its positive divisors (including 1 but excluding itself).
//
//For example, the number 6 is a perfect number because its divisors are 1, 2, and 3, and 
//1
//+
//2
//+
//3
//=
//6
//1+2+3=6.
//
//The first few perfect numbers are:
//
//6 (1 + 2 + 3 = 6)
//28 (1 + 2 + 4 + 7 + 14 = 28)
public class PerfectNumber {

    public static void main(String[] args) {
        int num = 6;
        perfectNumber(num);
    }

    public static void perfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            int mod = num % i;
            if (mod == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println("The given number is " + num + " a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");

        }
    }
}
