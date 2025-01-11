/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author thivya
 * 
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
* 
 */
public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count occurrences of each element in the array
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // Add all occurrence counts to a HashSet
        HashSet<Integer> set = new HashSet<>(mp.values());

        // Compare sizes: if unique, the sizes will match
        if(mp.size()==set.size())
        return true;
        else
        return false;
    }


    public static void main(String[] args) {

        // Test Case 1: Array with unique occurrences
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        System.out.println("Test Case 1: " + uniqueOccurrences(arr1)); // Expected output: true

        // Test Case 2: Array without unique occurrences
        int[] arr2 = {1, 2, 2, 1, 3, 3};
        System.out.println("Test Case 2: " + uniqueOccurrences(arr2)); // Expected output: false

        // Test Case 3: Array with all elements unique
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 3: " + uniqueOccurrences(arr3)); // Expected output: true

        // Test Case 4: Empty array
        int[] arr4 = {};
        System.out.println("Test Case 4: " + uniqueOccurrences(arr4)); // Expected output: true

        // Test Case 5: Array with a single element
        int[] arr5 = {1};
        System.out.println("Test Case 5: " + uniqueOccurrences(arr5)); // Expected output: true
    }
}
