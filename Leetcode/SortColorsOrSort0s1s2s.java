/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

* 
 */
public class SortColorsOrSort0s1s2s {
    
     // Method to sort the array with 0s, 1s, and 2s
    public static void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        // Iterate through the array
        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, start, mid);  // Swap 0 to the start
                    mid++;
                    start++;
                    break;

                case 1:
                    mid++;  // Move to the next element if it's 1
                    break;

                case 2:
                    swap(nums, mid, end);  // Swap 2 to the end
                    end--;
                    break;
            }
        }
    }

    // Method to swap two elements in the array
    public static void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }

    public static void main(String[] args) {
  

        // Example input array
        int[] nums = {2, 0, 2, 1, 1, 0};

        // Sort the array
        sortColors(nums);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    
    /*Using Brute force method
     
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
              if(arr[i]<arr[j]){
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
              
          }
    */
}
}
