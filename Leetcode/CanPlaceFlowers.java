/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length
* 
* Reference: Video: https://www.youtube.com/watch?v=57dy_jm7rWI
* Code: https://github.com/Ayu-99/Data-Structures/blob/master/Leetcode%20Challenge/January/Java/Can%20Place%20Flowers.java
 */
public class CanPlaceFlowers {
     public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int total = 0;

        for (int i = 0; i < flowerbed.length && total < n; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    total++;
                }
            }
        }

        return total == n;
    }


    public static void main(String[] args) {

        // Example test case 1
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Test Case 1: " + canPlaceFlowers(flowerbed1, n1)); // Expected: true

        // Example test case 2
        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("Test Case 2: " + canPlaceFlowers(flowerbed2, n2)); // Expected: false

        // Example test case 3
        int[] flowerbed3 = {0, 0, 1, 0, 0, 0, 1};
        int n3 = 2;
        System.out.println("Test Case 3: " + canPlaceFlowers(flowerbed3, n3)); // Expected: true
    }
}
