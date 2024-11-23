/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.

Answers within 10-5 of the actual value will be accepted as correct.

 

Example 1:


Input: hour = 12, minutes = 30
Output: 165
Example 2:


Input: hour = 3, minutes = 30
Output: 75
Example 3:


Input: hour = 3, minutes = 15
Output: 7.5
 

Constraints:

1 <= hour <= 12
0 <= minutes <= 59
* 
* 
 */
public class AngleBetweenHandsofaClock {
    public static double angleClock(int hour, int minutes) {
        // Calculate the angle of the hour hand
//        double hourAngle = (hour % 12 * 30) + ((double) minutes / 60 * 30);
double hourAngle = ((hour * 360) / 12) + ((double) minutes / 60 * 30);
        // Calculate the angle of the minute hand
        double minAngle = minutes * 6;

        // Calculate the absolute difference between the two angles
        double angle = Math.abs(hourAngle - minAngle);

        // Ensure the angle is the smaller angle between the two
        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }

    public static void main(String[] args) {
 
        // Test cases
        int hour1 = 12;
        int minutes1 = 30;
        System.out.printf("Input: hour = %d, minutes = %d\nOutput: %.5f\nExpected: 165.00000\n\n", 
                          hour1, minutes1, angleClock(hour1, minutes1));
        
        int hour2 = 3;
        int minutes2 = 15;
        System.out.printf("Input: hour = %d, minutes = %d\nOutput: %.5f\nExpected: 7.50000\n\n", 
                          hour2, minutes2, angleClock(hour2, minutes2));
        
        int hour3 = 9;
        int minutes3 = 0;
        System.out.printf("Input: hour = %d, minutes = %d\nOutput: %.5f\nExpected: 90.00000\n", 
                          hour3, minutes3, angleClock(hour3, minutes3));
    }
}
