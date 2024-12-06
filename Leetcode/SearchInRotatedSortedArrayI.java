/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author thivya
 * 
 * There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 * 

 */
public class SearchInRotatedSortedArrayI {

    public static void main(String[] args) {
        
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println(search(nums1, target1)); // Expected output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println(search(nums2, target2)); // Expected output: -1

        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(search(nums3, target3)); // Expected output: -1
    }
    
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            // Determine which part is sorted
            if (nums[low] <= nums[mid]) {
                // Left part is sorted
                if (nums[low] <= target && nums[mid] >= target) {
                    high = mid - 1; // Target is in the left part
                } else {
                    low = mid + 1; // Target is in the right part
                }
            } else {
                // Right part is sorted
                if (nums[mid] < target &&  nums[high] >= target) {
                    low = mid + 1; // Target is in the right part
                } else {
                    high = mid - 1; // Target is in the left part
                }
            }
        }
        return -1; // Target not found
    }

}







/*public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int length = array.size();
        int target = 8;
        int index = fnSearch(array, length, target);
        if (index == -1) {
            System.out.println("Target is not present.");
        } else {
            System.out.println("The index is: " + index);
        }
    }

    public static int fnSearch(ArrayList<Integer> array, int length, int target) {

        int low = 0;
        int high = length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array.get(mid) == target) {
                return mid;
            }

            if (array.get(low) <= array.get(mid)) {
                if (array.get(low) <= target && array.get(mid) >= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (array.get(mid) <= target && array.get(high) >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }
        return -1;
    }
*/