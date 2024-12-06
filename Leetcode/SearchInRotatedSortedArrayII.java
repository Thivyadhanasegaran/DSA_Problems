/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
 
 */
public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
       
        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;
        System.out.println(search(nums1, target1)); // Expected output: true

        int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
        int target2 = 3;
        System.out.println(search(nums2, target2)); // Expected output: false

        int[] nums3 = {1, 3, 1, 1, 1};
        int target3 = 3;
        System.out.println(search(nums3, target3)); // Expected output: true
    }
    
    public static boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return true;

            // Handling duplicates
            if ((nums[low] == nums[mid]) && (nums[mid] == nums[high])) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            // If left part is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && nums[mid] >= target) {
                    high = mid - 1; // Target is in the left part
                } else {
                    low = mid + 1; // Target is in the right part
                }
            } else { // If right part is sorted
                if (nums[mid] <= target && nums[high] >= target) {
                    low = mid + 1; // Target is in the right part
                } else {
                    high = mid - 1; // Target is in the left part
                }
            }
        }
        return false; // Target not found
    }
}
