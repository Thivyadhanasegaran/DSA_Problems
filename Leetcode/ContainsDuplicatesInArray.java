/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author thivya
 */
public class ContainsDuplicatesInArray {

    public static void main(String[] args) {
        int[] array = {2, 7, 5, 1, 8, 2};
        boolean result = fnDuplicatesInArray(array);
        if (result == true) {
            System.out.println("The array contains duplicates");
        } else {
            System.out.println("The array does not contains duplicates");
        }
    }

    public static boolean fnDuplicatesInArray(int[] array) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            //If that element is present in the array before, we can return true, because searching in an hashset requires only O(1) time
            if (hs.contains(array[i])) {
                return true;
            } //We add the number into our hashset
            else {
                hs.add(array[i]);
            }
        }
        return false;
    }
    //The time complexity of this approach is O(n), where n is the length of the array.
}


/*
HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : array) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }

The time complexity of this approach is O(n), where n is the length of the array.
 */
