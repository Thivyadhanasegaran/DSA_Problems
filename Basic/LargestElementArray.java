/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a Program to Find the Largest Element in an Array.
public class LargestElementArray {

    public static void main(String[] args) {
        int[] array = {3, 9, 4, 7, 1, 0, 2, 10};
        largestElementFunction(array);
    }

    public static void largestElementFunction(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("Largest number in the array is: " + largest);
    }

}
