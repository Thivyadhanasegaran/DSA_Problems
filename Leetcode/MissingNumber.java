/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

* 

 */
public class MissingNumber {
    // Method to find the missing number in the array
    public static int missingNumber(int[] nums) {
        int allXOR = 0;

        // XOR all the numbers from 0 to n
        for (int i = 0; i <= nums.length; i++) {
            allXOR = allXOR ^ i;
        }

        // XOR the array elements
        for (int num : nums) {
            allXOR = allXOR ^ num;
        }

        // The result is the missing number
        return allXOR;
    }
    
    /*Brute force approach
    
    for(int i=1;i<=arr.length+1;i++){
            boolean found = false;
            for(int j=0;i<arr.length;i++){
               
                if(arr[j]==i){
                found=true;
                break;
                }
            }
            if(!found)
            return i;
        }
        return -1;
    
    */
/*Using HashMap
    HashMap<Integer,Integer> mp =new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],i);
        }
        
         for(int i=1;i<=arr.length+1;i++){
             if(!mp.containsKey(i))
             return i;
             
         }
         
         return -1;
    */
    // Main method to test the functionality
    public static void main(String[] args) {
   
        
        // Test case 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums1)); // Output: 2

        // Test case 2
        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + missingNumber(nums2)); // Output: 2

        // Test case 3
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number: " + missingNumber(nums3)); // Output: 8
    }
}

/*Time complexity: O(N)
Space complexity: O(1)
*/