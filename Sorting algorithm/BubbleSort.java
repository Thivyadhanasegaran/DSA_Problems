/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author thivya
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {7, 3, 0, 9, 1, 6, 2, 5};
        bubblesortFunction(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
// Another Method to print array:
//System.out.print(Arrays.toString(array));

    }

    public static void bubblesortFunction(int[] array) {
//        1st method:
//           for (int a = 0; a < number.length - 1; a++) {
//            for (int i = 0; i < number.length - a - 1; i++) {
//                if (number[i] > number[i + 1]) {
//                    int temp;
//                    temp = number[i];
//                    number[i] = number[i + 1];
//                    number[i + 1] = temp;
//                }
//
//            }
//        }

//2nd Method:
//        for (int lastUnsortedIndex = number.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
//            for (int i = 0; i < lastUnsortedIndex; i++) {
//                if (number[i] > number[i + 1]) {
//                    swap(number, i, i + 1);
//                }
//
//            }
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

//Udemy method
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }

}

/*
Time Complexity: O(N^2)
Space Complexity: O(1) (we are sorting the original array itself without making a copy)
Uses Stable sort -- duplicate value present in the array doesnt get swapped from its original position
 */
