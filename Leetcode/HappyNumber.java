/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashSet;

/**
 *
 * @author thivya
 *
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the
 * squares of its digits. Repeat the process until the number equals 1 (where it
 * will stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy. Return true if n is a
 * happy number, and false if not.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 19 Output: true Explanation: 12 + 92 = 82 82 + 22 = 68 62 + 82 =
 * 100 12 + 02 + 02 = 1 Example 2:
 *
 * Input: n = 2 Output: false
 *
 *
 */
public class HappyNumber {

    public static void main(String[] args) {
        // Test cases
        int number1 = 19; // Example input 1
        int number2 = 2;  // Example input 2

        // Testing number1
        boolean result1 = isHappy(number1);
        System.out.println("Is " + number1 + " a happy number? " + result1);

        // Testing number2
        boolean result2 = isHappy(number2);
        System.out.println("Is " + number2 + " a happy number? " + result2);
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (true) {
            int sum = 0;

            // Extract each digit, square it, and add to sum
            while (n != 0) {
                int num = n % 10;
                sum = sum + (int) Math.pow(num, 2.0);
                n = n / 10;
            }

            // Check if the sum is 1
            if (sum == 1) {
                return true;
            }
            n = sum;

            // Check if we've seen this sum before (cycle detection)
            if (set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
            }
        }
    }
}

/*Time complexity: O(1)
Space complexity: O(1)
*/
