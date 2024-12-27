/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 *
 * How would you swap two numbers without using a third variable? Declare two
 * variables and initialize them with values. Make b the sum of both numbers.
 * Then subtract the sum (b) from a, so a is now swapped. Lastly, subtract a
 * from the sum (b), so b is also swapped.
 *
 */
public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        b = b + a; // now b is sum of both the numbers
        a = b - a; // b - a = (b + a) - a = b (a is swapped)
        b = b - a; // (b + a) - b = a (b is swapped)
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
    }
}
