/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

import java.util.Arrays;

/**
 *
 * @author thivya
 * 
 * Given an unsorted array arr[ ] having both negative and positive integers. The task is to place all negative elements at the end of the array without changing the order of positive elements and negative elements.

Note: Don't return any array, just in-place on the array.

Examples:

Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
Output : [1, 3, 2, 11, 6, -1, -7, -5]
Explanation: By doing operations we separated the integers without changing the order.
Input : arr[] = [-5, 7, -3, -4, 9, 10, -1, 11]
Output : [7, 9, 10, 11, -5, -3, -4, -1]
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)


* 
* Reference: https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
 */
public class Moveallnegativeelementstoend {
    public static void segregateElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        // Add positive elements to the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Add negative elements to the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Copy the result array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        System.out.println("Original array: " + Arrays.toString(arr));

       segregateElements(arr);

        System.out.println("Array after segregation: " + Arrays.toString(arr));
    }
}
