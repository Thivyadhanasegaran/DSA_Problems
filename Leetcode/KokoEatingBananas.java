/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
* 

 */
public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        // Find the maximum pile size
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        // Binary Search for the minimum eating speed
        int left = 1;
        int right = max;

        while (left < right) {
            int mid = left + (right - left) / 2; // Midpoint of the current search space
            int result = 0;

            // Calculate hours required at the current eating speed 'mid'
            for (int i = 0; i < piles.length; i++) {
                result += (int) Math.ceil((double) piles[i] / mid);
            }

            // Adjust the binary search range
            if (result > h) { // Too slow, increase speed
                left = mid + 1;
            } else { // Fast enough, try to minimize speed
                right = mid;
            }
        }

        return left; // Minimum eating speed found
    }

    public static void main(String[] args) {
      
        // Sample input
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        // Output the result
        System.out.println("Minimum Eating Speed: " + minEatingSpeed(piles, h));
    }
}
