/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author thivya
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {7, 3, 0, 9, 1, 6, 2, 5, 6};
        insertionSortFunction(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSortFunction(int[] array) {
        //1st Method
//        for (int i = 1; i < number.length; i++) {
//            int temp = number[i];
//            int j = i - 1;
//
//            while (j >= 0 && number[j] > temp) {
//                number[j + 1] = number[j];
//                j--;
//            }
//            number[j+1] = temp;
//        }
//    }
//2nd Method
//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < number.length; firstUnsortedIndex++) {
//            int newElement = number[firstUnsortedIndex];
//            int i;
//            for (i = firstUnsortedIndex; i > 0 && number[i - 1] > newElement; i--) {
//                number[i] = number[i - 1];
//            }
//            number[i] = newElement;
//
//        }

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }

        }
    }
}
