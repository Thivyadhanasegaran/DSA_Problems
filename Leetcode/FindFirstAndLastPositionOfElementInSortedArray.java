/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 *
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4] Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1] Example 3:
 *
 * Input: nums = [], target = 0 Output: [-1,-1]
 *
 *

 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] range1 = searchRange(nums1, target1);
        System.out.println("Range for target " + target1 + ": [" + range1[0] + ", " + range1[1] + "]");

        // Test case 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] range2 = searchRange(nums2, target2);
        System.out.println("Range for target " + target2 + ": [" + range2[0] + ", " + range2[1] + "]");

        // Test case 3
        int[] nums3 = {};
        int target3 = 0;
        int[] range3 = searchRange(nums3, target3);
        System.out.println("Range for target " + target3 + ": [" + range3[0] + ", " + range3[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = fnLeftPosition(nums, target);
        int right = fnRightPosition(nums, target);

        int[] result = new int[2];
        result[0] = left;
        result[1] = right;
        return result;
    }

    public static int fnLeftPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                high = mid - 1; // Search on the left side for the first occurrence
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static int fnRightPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                low = mid + 1; // Search on the right side for the last occurrence
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

}
