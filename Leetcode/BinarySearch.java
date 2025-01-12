/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.

Note: If multiple occurrences are there, please return the smallest index.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: 3
Explanation: 4 appears at index 3.
Input: arr[] = [11, 22, 33, 44, 55], k = 445
Output: -1
Explanation: 445 is not present.
Input: arr[] = [1, 1, 1, 1, 2], k = 1
Output: 0
Explanation: 1 appears at index 0.
Note: Try to solve this problem in constant space i.e O(1)

Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <= 106
1 <= k <= 106
* 
* 
 */
public class BinarySearch {
    // Method to perform binary search
    public static int binarysearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1; // Initialize the index to -1 for not found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the middle element matches the target
            if (arr[mid] == k) {
                index = mid; // Store the index of the found element
                high = mid - 1; // Search for the first occurrence (left side)
            } else if (arr[mid] > k) {
                high = mid - 1; // Move to the left half
            } else {
                low = mid + 1; // Move to the right half
            }
        }

        return index;
    }

    public static void main(String[] args) {
    
       // Hardcoded sorted array
        int[] arr = {1, 2, 2, 3, 4, 5};

        // Element to search for
        int k = 2;

        // Call the binarysearch method
        int result = binarysearch(arr, k);

        // Print the result
        if (result == -1) {
            System.out.println("Element " + k + " not found in the array.");
        } else {
            System.out.println("First occurrence of element " + k + " is at index: " + result);
        }
    }
}

