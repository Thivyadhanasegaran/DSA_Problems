/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Given an unsorted array arr containing both positive and negative numbers. Your task is to rearrange the array and convert it into an array of alternate positive and negative numbers without changing the relative order.

Note:
- Resulting array should start with a positive integer (0 will also be considered as a positive integer).
- If any of the positive or negative integers are exhausted, then add the remaining integers in the answer as it is by maintaining the relative order.
- The array may or may not have equal number of positive and negative integers.

Examples:

Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
Output: 9 -2 4 -1 5 -5 0 -3 2
Explanation: The positive numbers are [9, 4, 5, 0, 2] and the negative integers are [-2, -1, -5, -3]. Since, we need to start with the positive integer first
and then negative integer and so on (by maintaining the relative order as well), hence we will take 9 from the positive set of elements and then
-2 after that 4 and then -1 and so on.
Hence, the output is 9, -2, 4, -1, 5, -5, 0, -3, 2.
* 
* Reference: https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
 */
public class Alternatepositiveandnegativenumbers {
     public static void rearrange(ArrayList<Integer> arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }

        int indexPos = 0;
        int indexNeg = 0;

        // Fill the original array alternating between positive and negative
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) { // Even index - place positive
                if (indexPos < pos.size()) {
                    arr.set(i, pos.get(indexPos));
                    indexPos++;
                } else if (indexNeg < neg.size()) { // If no positives left, fill with negatives
                    arr.set(i, neg.get(indexNeg));
                    indexNeg++;
                }
            } else { // Odd index - place negative
                if (indexNeg < neg.size()) {
                    arr.set(i, neg.get(indexNeg));
                    indexNeg++;
                } else if (indexPos < pos.size()) { // If no negatives left, fill with positives
                    arr.set(i, pos.get(indexPos));
                    indexPos++;
                }
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // Example input
        int[] input = {35, -43, 29, 32, -37, 46, -3, -19, 32, 43, 27, -21, -35, -25};

        // Populate the ArrayList with the input values
        for (int num : input) {
            arr.add(num);
        }

        // Create an instance of Solution and rearrange the array
   
        rearrange(arr);

        // Print the rearranged array
        System.out.println(arr);
    } 
}
