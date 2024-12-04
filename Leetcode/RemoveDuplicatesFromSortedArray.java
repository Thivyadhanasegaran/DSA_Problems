/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya Remove Duplicates from Sorted Array
 *
 * Solution Given an integer array nums sorted in non-decreasing order, remove
 * the duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same. Then return the
 * number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you
 * need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the
 * unique elements in the order they were present in nums initially. The
 * remaining elements of nums are not important as well as the size of nums.
 * Return k. Example 1:
 *
 * Input: nums = [1,1,2] Output: 2, nums = [1,2,_] Explanation: Your function
 * should return k = 2, with the first two elements of nums being 1 and 2
 * respectively. It does not matter what you leave beyond the returned k (hence
 * they are underscores). Example 2:
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements
 * of nums being 0, 1, 2, 3, and 4 respectively. It does not matter what you
 * leave beyond the returned k (hence they are underscores).
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104 -100 <= nums[i] <= 100 nums is sorted in
 * non-decreasing order.
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }
        return index;
    }
}


/*In the main method, an input array nums is initialized with some values 
{1, 1, 2}. 
The removeDuplicates method takes the input array nums as an argument.
Inside removeDuplicates:
An index variable is initialized to 1. This will be used 
to track the position where non-duplicate elements are stored.
The for loop iterates over the input array nums.
At each iteration, it checks if the current element 
(nums[i]) is different from the next element (nums[i + 1]). If they are different, it means the current element is not a duplicate.
If they are different, the next index of the modified
array (nums[index]) is updated with the next non-duplicate element 
(nums[i + 1]), and index is incremented.
Finally, the method returns index, which represents the length 
of the modified array with duplicates removed.
In the main method, the result returned by removeDuplicates is 
printed, which represents the length of the modified array.*/
