/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
If there are multiple solutions, find the lexicographically smallest one.

Note: The given array is sorted in ascending order, and you don't need to return anything to change the original array.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
Input: arr[] = [2, 4, 7, 8, 9, 10]
Output: [4, 2, 8, 7, 10, 9]
Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.

Input: arr[] = [1]
Output: [1]
* 
* reference: https://www.geeksforgeeks.org/problems/wave-array-1587115621/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
 */
public class WaveArray {
    
    // Method to convert the array into wave-like form
    public static void convertToWave(int[] arr) {
        int len = arr.length;

        // Iterate with a step of 2 to swap adjacent elements
        for (int i = 0; i < len - 1; i += 2) {
            swap(arr, i, i + 1);
        }
    }

    // Helper method to swap two elements in the array
    private static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Convert the array to wave form
        convertToWave(arr);

        // Print the resulting array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
