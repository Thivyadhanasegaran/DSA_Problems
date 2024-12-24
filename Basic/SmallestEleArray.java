/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a code to Print the smallest element of the array
public class SmallestEleArray {

    public static void main(String[] args) {
        int[] array = {5, 8, 2, 7, 9, 4, 1};
        int number = smallestEleFunction(array);
        System.out.println("The smallest element in the array is " + number);
    }

    public static int smallestEleFunction(int[] array) {
        int small = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }
}
