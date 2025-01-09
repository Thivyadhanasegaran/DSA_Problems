/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.

 

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].

 */
public class FindTheDifferenceOfTwoArrays {
    
    // Method to find differences between two arrays
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();

        // Add all elements from nums1 to set1
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        // Add all elements from nums2 to set2
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        // Find elements in set1 that are not in set2
        for (int n : set1) {
            if (!set2.contains(n)) {
                ls1.add(n);
            }
        }

        // Find elements in set2 that are not in set1
        for (int n : set2) {
            if (!set1.contains(n)) {
                ls2.add(n);
            }
        }

        // Add the two lists to the output
        output.add(ls1);
        output.add(ls2);

        return output;
    }

    // Main method to test the solution
    public static void main(String[] args) {
      

        // Test input arrays
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {2, 4, 6};

        // Call the findDifference method
        List<List<Integer>> result = findDifference(nums1, nums2);

        // Print the output
        System.out.println("Elements in nums1 but not in nums2: " + result.get(0));
        System.out.println("Elements in nums2 but not in nums1: " + result.get(1));
    }
    
}
