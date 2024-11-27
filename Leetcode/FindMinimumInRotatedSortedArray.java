/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 *
 *
 * Suppose an array of length n sorted in ascending order is rotated between 1
 * and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
 *
 * [4,5,6,7,0,1,2] if it was rotated 4 times. [0,1,2,4,5,6,7] if it was rotated
 * 7 times. Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time
 * results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 *
 * Given the sorted rotated array nums of unique elements, return the minimum
 * element of this array.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,4,5,1,2] Output: 1 Explanation: The original array was
 * [1,2,3,4,5] rotated 3 times. Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2] Output: 0 Explanation: The original array was
 * [0,1,2,4,5,6,7] and it was rotated 4 times. Example 3:
 *
 * Input: nums = [11,13,15,17] Output: 11 Explanation: The original array was
 * [11,13,15,17] and it was rotated 4 times.
 *
 */
public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {

        // Test cases
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {11, 13, 15, 17};

        System.out.println("Minimum in nums1: " + findMin(nums1)); // Expected output: 1
        System.out.println("Minimum in nums2: " + findMin(nums2)); // Expected output: 0
        System.out.println("Minimum in nums3: " + findMin(nums3)); // Expected output: 11

        // Additional test cases
        int[] nums4 = {2, 2, 2, 0, 1};
        int[] nums5 = {1};
        int[] nums6 = {2, 1};

        System.out.println("Minimum in nums4: " + findMin(nums4)); // Expected output: 0
        System.out.println("Minimum in nums5: " + findMin(nums5)); // Expected output: 1
        System.out.println("Minimum in nums6: " + findMin(nums6)); // Expected output: 1
    }

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the subarray is already sorted
            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }

            // If the left side is sorted
            if (nums[low] <= nums[mid]) {
                // Update the minimum
                ans = Math.min(ans, nums[low]);
                // Move to the right part of the array
                low = mid + 1;
            } else {
                // If the right side is sorted, update the minimum
                ans = Math.min(ans, nums[mid]);
                // Move to the left part of the array
                high = mid - 1;
            }
        }
        return ans;
    }
}

/*Time Complexity: O(logN), N = size of the given array.
Reason: We are basically using binary search to find the minimum. 

Space Complexity: O(1)
Reason: We have not used any extra data structures, this
makes space complexity, even in the worst case as O(1).*/
