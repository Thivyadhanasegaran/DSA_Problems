/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write code of Greatest Common Divisor 
public class Gcd {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int gcdresult = gcdCalculate(num1, num2);
        System.out.println("The GCD value is : " + gcdresult);
    }

    public static int gcdCalculate(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}
