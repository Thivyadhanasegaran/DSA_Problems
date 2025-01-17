/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.PriorityQueue;

/**
 *
 * @author thivya
 * 
 * Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
* 
* Reference: https://www.youtube.com/watch?v=FrWq2rznPLQ
* Code: https://leetcode.com/problems/kth-largest-element-in-an-array/solutions/3906260/100-3-approaches-video-heap-quickselect-sorting/?envType=study-plan-v2&envId=leetcode-75
 */
public class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        // Create a Min Heap (TC: O(nlogk) SC:O(k)) (default in Java PriorityQueue is Min Heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 

        // Add elements to the heap
        for (int i : nums) {
            minHeap.add(i); // Add the current element
            if (minHeap.size() > k) {
                minHeap.remove(); // Remove the smallest element if size exceeds k
            }
        }

        // The root of the heap is the kth largest element
        return minHeap.remove();
        
        
         // Using sorting technique (TC: O(nlogn) SC:O(1))
        // Arrays.sort(nums);

        // return nums[nums.length-k];
    }

    public static void main(String[] args) {
     

        // Test Case
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\nK: " + k);

        int kthLargest = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }
}
