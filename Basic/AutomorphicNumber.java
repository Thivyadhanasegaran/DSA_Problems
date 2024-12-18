/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a code to find an Automorphic number
//An automorphic number is a type of number that remains 
//unchanged when its square is concatenated with its original value. 
//In other words, an n-digit number is called automorphic if its square
//ends with the original number itself.
public class AutomorphicNumber {

    public static void main(String[] args) {
        int number = 25;
        boolean status = checkAutomorphicNumber(number);
        if (status == true) {
            System.out.println("Number " + number + " is a Automorphic Number");
        } else {
            System.out.println("Number " + number + " is not a Automorphic Number");
        }
    }

    public static boolean checkAutomorphicNumber(int number) {
        System.out.println(number);
        String num = String.valueOf(number);
        String sqr = String.valueOf(number * number);
        System.out.println(num);
        System.out.println(sqr);
        if (sqr.endsWith(num)) {
            return true;
        } else {
            return false;
        }
    }
}
