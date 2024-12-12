/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author thivya
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] nums = {4, 6, 1, 7, 3, 2, 5};

        int firstIndex = 0;
        int secondIndex = nums.length - 1;
        quickSort(nums, firstIndex, secondIndex);
        System.out.print("Sorted array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }

     public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int swapIndex = pivot(nums, left, right);

            quickSort(nums, left, swapIndex - 1);
            quickSort(nums, swapIndex + 1, right);
        }
    }

    public static void swap(int[] nums, int firstIndex, int secondIndex) {
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

    public static int pivot(int[] nums, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (nums[i] < nums[pivotIndex]) {
                swapIndex++;
                swap(nums, swapIndex, i);
            }
        }
        swap(nums, swapIndex, pivotIndex);
        return swapIndex;
    }
}


//Time complexity: O(nlogn)



//    public static void quickSort(int[] array) {
//        quickSort(array, 0, array.length - 1);
//    }
//
//    private static void quickSort(int[] array, int lb, int ub) {
//        if (lb < ub) {
//            // Partition the array into two halves
//            int partitionIndex = partition(array, lb, ub);
//
//            // Recursively sort each half
//            quickSort(array, lb, partitionIndex - 1);
//            quickSort(array, partitionIndex + 1, ub);
//        }
//    }
//
//    private static int partition(int[] array, int lb, int ub) {
//        int pivot = array[lb];
//        int start = lb;
//        int end = ub;
//
//        while (start < end) {
//            while (array[start] <= pivot && start < ub) {
//                start++;
//            }
//            while (array[end] > pivot && end > lb) {
//                end--;
//            }
//            if (start < end) {
//                swap(array, start, end);
//            }
//        }
//        swap(array, lb, end);
//        return end;
//    }
//
//    private static void swap(int[] array, int i, int j) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }

