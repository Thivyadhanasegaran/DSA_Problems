/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a code to Sort the element of the array
public class SortArray {

    public static void main(String[] args) {
        int[] array = {3, 7, 0, 1, 9, 2};
        sortArrayFunction(array);
    }

    public static void sortArrayFunction(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }

        }
        System.out.println("Sorted array is:");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}
