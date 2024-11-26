/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
* 

 */
public class FindAllDuplicatesinanArray {
    
     public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            // If the value at nums[index] is already negative, it means we've seen this number before
            if (nums[index] < 0) {
                list.add(index + 1);  // Add the duplicate to the list
            }

            // Mark the value as negative to indicate we've seen this number
            nums[index] = nums[index] * -1;
        }

        return list;  // Return the list of duplicates
    }
    
    public static void main(String[] args) {
    
        // Example input array
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        
        // Find duplicates
        List<Integer> duplicates = findDuplicates(nums);
        
        // Print the result
        System.out.println("Duplicate numbers: " + duplicates);
    }
    
    /* Using HashMap
     HashMap<Integer,Integer> mp =new HashMap<>();
      
      for(int i=0;i<arr.length;i++){
          mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
      }
      List<Integer> list = new ArrayList<>();
      int index=0;
      mp.forEach((key,value)->{
          if(value>=2){
              list.add(key);
          }
      });
      
      return list;
    */
    
}
