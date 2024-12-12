/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search;

/**
 *
 * @author thivya
 */
/*Binary Search is a search algorithm that is specifically designed for searching 
in sorted data structures. This searching algorithm is much more efficient than Linear
Search as they repeatedly target the center of the search structure and divide the search 
space in half. It has logarithmic time complexity i.e. O(log N).

Now, the question arises, is Binary Search applicable to unsorted arrays?

So, the answer is NO, it is not possible to use or implement Binary Search on unsorted
arrays or lists, because, the repeated targeting of the mid element of one half depends 
on the sorted order of data structure.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 7;
        int result = binarySearchFunction(array, num);
        if (result == -1) {
            System.out.println("The element is not found in the array");
        } else {
            System.out.println("The element " + num + " is found at index " + result + " in the array");
        }

    }

    public static int binarySearchFunction(int[] array, int num) {
        int l = 0;
        int r = array.length - 1;
        int m = l + (r - l) / 2;
        while (l <= r) {
            if (array[m] == num) {
                return m;
            }
            if (array[m] > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }

        }
        return -1;
    }
}
