/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author thivya
 */
// Java program for Merge Sort
import java.util.Arrays;

class MergeSort {

    public static void main(String args[]) {
        int[] originalArray = {1, 8, 7, 5};
        int[] sortedArray = mergeSort(originalArray);

        for (int num : sortedArray) {
            System.out.println(num);
        }

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

    }

    //Udemy code
    //https://www.udemy.com/course/data-structures-and-algorithms-java/learn/lecture/29912906#overview
    public static int[] mergeSort(int[] array) {

        if (array.length == 1) {
            return array;
        }

        int midIndex = array.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];

        int index = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {

            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                i++;
                index++;

            } else {

                combined[index] = array2[j];
                j++;
                index++;
            }

        }

        while (i < array1.length) {
            combined[index] = array1[i];
            i++;
            index++;
        }

        while (j < array2.length) {
            combined[index] = array2[j];
            j++;
            index++;

        }
        return combined;
    }

}

// Youtube code
// Merges two subarrays of arr[].
// First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
//    void merge(int arr[], int l, int m, int r) {
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        // Create temp arrays
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        // Copy data to temp arrays
//        for (int i = 0; i < n1; ++i) {
//            L[i] = arr[l + i];
//        }
//        for (int j = 0; j < n2; ++j) {
//            R[j] = arr[m + 1 + j];
//        }
//
//        // Merge the temp arrays
//        // Initial indices of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarray array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            } else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy remaining elements of L[] if any
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        // Copy remaining elements of R[] if any
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    // Main function that sorts arr[l..r] using
//    // merge()
//    void sort(int arr[], int l, int r) {
//        if (l < r) {
//
//            // Find the middle point
//            int m = l + (r - l) / 2;
//
//            // Sort first and second halves
//            sort(arr, l, m);
//            sort(arr, m + 1, r);
//
//            // Merge the sorted halves
//            merge(arr, l, m, r);
//        }
//    }
//
//    // A utility function to print array of size n
//    static void printArray(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }   

