/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
// Write a code to find non-repeating elements in an array.
import java.util.HashMap;
import java.util.Arrays;

public class NonRepeatingElementArray {

    public static void main(String[] args) {
        int[] array = {10, 30, 10, 60, 90, 10, 60};
        System.out.println("The original array is " + Arrays.toString(array));
        nonRepeatingArrayFunction(array);

    }

    public static void nonRepeatingArrayFunction(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }

        for (int a : map.keySet()) {
            if (map.get(a) == 1) {
                System.out.println("The non repeating array is " + a);
            }

        }

    }
}
