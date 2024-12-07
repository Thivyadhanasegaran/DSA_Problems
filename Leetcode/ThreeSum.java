/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.


 */
public class ThreeSum {
    public static void main(String[] args) {
      
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        
        System.out.println("Unique triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
    
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(set);
    }
}

/*
Time complexity - O(N^2)
Space complexity - O(N)
*/ 
/*
Notes:
1. Check if array is null or <3 (because for triplet we need atleast 3 element in an array) , if not return emtpy arraylist.

2.Sort the array

3. Create new hashset (since we can get duplicate sets, by storing it in the hashset it returns unique set value)

4. Use for loop to loop through the entire array from 0 to array.length-2 (because we need atleast 3 elements in the array to check)

5. From remaining element, pick 2 elements to identify the pair to make sum=0;

6. Keep left and right pointer to loop through the entire array.

7. If sum is 0, then add all the three elements to hashset

8. If sum<0; the increment left++

9. else right--;


*/ 