/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.

 */
public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Create a frequency map to count occurrences of each number
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        // Step 2: Create a bucket array where index is frequency, and each bucket contains numbers with that frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : mp.keySet()) {
            int freq = mp.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Step 3: Collect the top K frequent elements from the bucket
        int[] result = new int[k];
        int counter = 0;
        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[counter++] = num;
                    if (counter == k) {
                        break;  // Stop once we have filled the result array with k elements
                    }
                }
            }
        }

        return result;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        System.out.println("Top " + k1 + " frequent elements: " + Arrays.toString(topKFrequent(nums1, k1))); 
        // Output: [1, 2]

        // Test case 2
        int[] nums2 = {4, 1, -1, 2, -1, 2, 3};
        int k2 = 2;
        System.out.println("Top " + k2 + " frequent elements: " + Arrays.toString(topKFrequent(nums2, k2))); 
        // Output: [-1, 2]

        // Test case 3
        int[] nums3 = {1};
        int k3 = 1;
        System.out.println("Top " + k3 + " frequent element: " + Arrays.toString(topKFrequent(nums3, k3))); 
        // Output: [1]
    }
}
