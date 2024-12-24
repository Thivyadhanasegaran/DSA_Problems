/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a code to Reverse the element of the array
public class ReverseArrayElement {

    public static void main(String[] args) {
        int[] array = {4, 9, 2, 8, 5, 0, 6};
        System.out.println("The reversed array is:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");

            /*Alternative method
            int[] a = { 1, 2, 7, 6, 4, 9, 12 };
            for (int t = 0; t < a.length / 2; t++) { 
            int tmp = a[t]; 
            a[t] = a[a.length - t - 1]; 
            a[a.length - t- 1] = tmp; 
            } 
             */
        }
    }
}
