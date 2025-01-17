/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given a sorted array arr[]  and a number k, find a pair in sorted order in an array whose sum is closest to k.
Note: If there are multiple such pairs return the pair with maximum absolute difference.

Examples:

Input: arr[] = [10, 22, 28, 29, 30, 40], k = 54
Output: [22, 30]
Explanation: As 22 + 30 = 52 is closest to 54.
Input: arr[] = [1, 2, 3, 4, 5], k = 10
Output: [4, 5]
Explanation: As 4 + 5 = 9 is closest to 10.
* 
* Reference: https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
 */
public class SumPairclosesttok {
    // Function to find the pair with the sum closest to the target `k`
    static int[] sumClosest(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - k);

            // Update the result if a closer pair is found
            if (minDiff > diff) {
                minDiff = diff;
                result[0] = arr[left];
                result[1] = arr[right];
            }

            // Move the pointers based on the comparison of sum and target
            if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        
        return result;
    }

    // Main function to test the sumClosest method
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 10, 20};  // Example array
        int k = 15;  // Example target sum

        int[] result = sumClosest(arr, k);
        System.out.println("Pair closest to " + k + " is: (" + result[0] + ", " + result[1] + ")");
    }
}
