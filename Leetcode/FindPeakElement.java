/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 

Constraints:

1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
nums[i] != nums[i + 1] for all valid i.
 */
public class FindPeakElement {
    // Method to find a peak element in the array
    public static int findPeakElement(int[] nums) {
        
       // Simple approach
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = left + (right-left)/2;

            if(nums[mid]<nums[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
        
//        if (nums.length == 1) return 0; // If there is only one element, it's the peak
//        int n = nums.length;
//
//        // Check if the first or last element is the peak
//        if (nums[0] > nums[1]) return 0;
//        if (nums[n - 1] > nums[n - 2]) return n - 1;
//
//        int low = 1;
//        int high = n - 2;
//
//        // Binary search for the peak element
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            // Check if the current element is a peak
//            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
//                return mid;
//            } else if (nums[mid] < nums[mid - 1]) {
//                high = mid - 1; // Move left
//            } else {
//                low = mid + 1; // Move right
//            }
//        }
//        return -1; // This line should never be reached
    }

    public static void main(String[] args) {
   
        // Hardcoded array
        int[] nums = {1, 2, 3, 1};

        // Call the findPeakElement method
        int peakIndex = findPeakElement(nums);

        // Print the result
        System.out.println("Peak element found at index: " + peakIndex);
    }
}

/*Complexity Analysis

Time Complexity: O(logN), N = size of the given array.
Reason: We are basically using binary search to find the minimum.

Space Complexity: O(1)
Reason: We have not used any extra data structures, this makes space 
complexity, even in the worst case as O(1).*/