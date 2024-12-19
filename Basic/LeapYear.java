/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write to code to check whether a given year is leap year or not.
public class LeapYear {

    public static void main(String[] args) {
        int number = 2023;
        boolean result = leapyearFunction(number);
        if (result == true) {
            System.out.println(number + " is a leap year");
        } else {
            System.out.println(number + " is not a leap year");
        }

    }

    public static boolean leapyearFunction(int number) {
        if (number % 4 == 0 && (number % 100 != 0 || number % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

}
