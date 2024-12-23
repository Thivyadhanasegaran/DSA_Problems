/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
//  Write a code to replace each element in an array by its rank in the array
import java.util.Arrays;

public class RankOfElementInArray {

    public static void main(String[] args) {
        int[] array = {3, 8, 2, 9, 3, 1, 6};
        System.out.println("The original array is " + Arrays.toString(array));
        int[] newarray = rankFunction(array);

        System.out.println("The new array with rank is " + Arrays.toString(newarray));
    }

    public static int[] rankFunction(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < copyArray.length; j++) {
                if (copyArray[j] == array[i]) {
                    array[i] = j + 1;
                    break;
                }
            }
        }
        return array;
    }
}
