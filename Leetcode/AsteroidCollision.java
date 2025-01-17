/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Stack;

/**
 *
 * @author thivya
 * 
 * We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
* 
* Reference: https://www.youtube.com/watch?v=6GGTBM7mwfs
 */
public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (st.isEmpty() || asteroids[i] > 0) {
                st.push(asteroids[i]);
            } else {
                while (true) {
                    int peek = st.peek();
                    if (peek < 0) {
                        st.push(asteroids[i]);
                        break;
                    } else if (peek == -asteroids[i]) {
                        st.pop();
                        break;
                    } else if (peek > -asteroids[i]) {
                        break;
                    } else {
                        st.pop();
                        if (st.isEmpty()) {
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        int[] array = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            array[i] = st.pop();
        }

        return array;
    }

    // Main method for testing
    public static void main(String[] args) {
        

        // Test cases
        int[] asteroids1 = {5, 10, -5};
        int[] result1 = asteroidCollision(asteroids1);
        printArray(result1); // Expected output: [5, 10]

        int[] asteroids2 = {8, -8};
        int[] result2 =asteroidCollision(asteroids2);
        printArray(result2); // Expected output: []

        int[] asteroids3 = {10, 2, -5};
        int[] result3 = asteroidCollision(asteroids3);
        printArray(result3); // Expected output: [10]

        int[] asteroids4 = {-2, -1, 1, 2};
        int[] result4 = asteroidCollision(asteroids4);
        printArray(result4); // Expected output: [-2, -1, 1, 2]
    }

    // Helper method to print arrays
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
