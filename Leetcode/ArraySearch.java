/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

Examples:

Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: There is one test case with array as [1, 2, 3 4] and element to be searched as 3. Since 3 is present at index 2, the output is 2.
Input: arr[] = [10, 8, 30, 4, 5], x = 5
Output: 4
Explanation: For array [1, 2, 3, 4, 5], the element to be searched is 5 and it is at index 4. So, the output is 4.
Input: arr[] = [10, 8, 30], x = 6
Output: -1
Explanation: The element to be searched is 6 and its not present, so we return -1.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1). 
* 
* 
 */
public class ArraySearch {
    // Method to search for an element in the array
    static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }


    public static void main(String[] args) {
        // Hardcoded array
        int[] arr = {10, 20, 30, 40, 50};
        
        // Element to search for
        int x = 30;

        // Call the search method and print the result
        int result =search(arr, x);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

