/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

import java.util.ArrayList;

/**
 *
 * @author thivya
 */
public class MissingAndRepeating {
    // Function to find two elements in the array
   static ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> ls = new ArrayList<>();

        // Sort the array using Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        int repeated = 0;
        int missing = 0;

        // Find the repeated number
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeated = arr[i];
                ls.add(repeated); // Add the repeated number to the list
                break;
            }
        }

        int n = arr.length;

        // Use `long` to handle large sums
        long actualSum = (long) n * (n + 1) / 2;
        long sum = 0;

        // Calculate the sum of the array elements
        for (int num : arr) {
            sum += num;
        }

        // Calculate the missing number
        missing = (int) (actualSum - (sum - repeated));
        ls.add(missing); // Add the missing number to the list

        return ls;
    }

    // Merge Sort Helper Function
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively divide the array
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge function to combine two sorted halves
    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to hold the split values
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data into temporary arrays L[] and R[]
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int i = 0; i < n2; i++)
            R[i] = arr[mid + 1 + i];

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of L[], if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy the remaining elements of R[], if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

        // Example input
        int arr[] = {4, 3, 6, 2, 1, 1};

        // Find the repeated and missing numbers
        ArrayList<Integer> result = findTwoElement(arr);

        // Print the result
        System.out.println("Repeated Number: " + result.get(0));
        System.out.println("Missing Number: " + result.get(1));
    }
}

