/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author thivya
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {7, 3, 0, 9, 1, 6, 2, 5};
        selectionSortFunction(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSortFunction(int[] array) {

//        for (int lastUnsortedIndex = number.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
//            int largest = 0;
//            for (int i = 1; i <= lastUnsortedIndex; i++) {
//                if (number[i] > number[largest]) {
//                    largest = i;
//                }
//            }
//            swap(number, largest, lastUnsortedIndex);
//        }
//    }
//
//    public static void swap(int[] number, int i, int j) {
//        if (i == j) {
//            return;
//        }
//        int temp = number[i];
//        number[i] = number[j];
//        number[j] = temp;
//    }

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

        }
    }
}

/*
Time Complexity: O(N^2)
 */
