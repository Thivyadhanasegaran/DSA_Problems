/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

import java.util.HashMap;

/**
 *
 * @author thivya
 * 
 * Find the first non-repeating element in a given array arr of integers and if there is not present any non-repeating element then return 0

Note: The array consists of only positive and negative integers and not zero.

Examples:

Input: arr[] = [-1, 2, -1, 3, 2]
Output: 3
Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once. Hence, the output is 3. 
Input: arr[] = [1, 1, 1]
Output: 0
Explanation: There is not present any non-repeating element so answer should be 0.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
* 
 */
public class NonRepeatingElement {
    // Method to find the first non-repeating element
    public static int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count the frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // Find and return the first element with a count of 1
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i]) && mp.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        // Return 0 if no non-repeating element is found
        return 0;
    }

    public static void main(String[] args) {
   
        int[] arr = {9, 4, 9, 6, 7, 4};

        // Find the first non-repeating element
        int result = firstNonRepeating(arr);

        // Print the result
        if (result != 0) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
