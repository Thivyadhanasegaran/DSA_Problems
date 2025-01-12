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
 * Given an array arr[], find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

Note:- The position you return should be according to 1-based indexing. 

Examples:

Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
Output: 2
Explanation: 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3.
Input: arr[] = [1, 2, 3, 4]
Output: -1
Explanation: All elements appear only once so answer is -1.
Expected Time Complexity: O(n)
Expected Auxilliary Space: O(n)
* 
* 
 */
public class FirstRepeatingElement {
    // Function to find the first repeating element in the array
    public static int firstRepeated(int[] arr) {
        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count the frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // Iterate through the array to find the first element with frequency > 1
        for (int j = 0; j < arr.length; j++) {
            if (mp.containsKey(arr[j]) && mp.get(arr[j]) > 1) {
                return j + 1; // Return the 1-based index
            }
        }

        // If no repeating element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {1, 5, 3, 4, 3, 5, 6};

        // Call the function to find the first repeating element
        int result = firstRepeated(arr);

        // Print the result
        if (result != -1) {
            System.out.println("The first repeating element is at 1-based index: " + result);
        } else {
            System.out.println("No repeating element found.");
        }
}
}
