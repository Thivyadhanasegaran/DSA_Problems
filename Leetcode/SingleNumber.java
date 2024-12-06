/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya 
 * 
 * Given a non-empty array of integers nums, every element
 * appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 *
 * Example 1: Input: nums = [2,2,1] Output: 1
 *
 * Example 2: Input: nums = [4,1,2,1,2] Output: 4
 *
 * Example 3: Input: nums = [1] Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104 -3 * 104 <= nums[i] <= 3 * 104 Each element in
 * the array appears twice except for one element which appears only once
 *
 * Use XOR operator (exclusive OR) 
 * 0^0 = 0 
 * 1^1 = 0 
 * 1^0 = 1 
 * 0^1 = 1 
 * 5^0 = 5 
 * 5^5 = 0
 * 2^3 = 1 
 * 2^5 = 7 
 * 2^10 = 8
 *
 * decimal|binary| bits(expanded) 0 | 0000 | 0 1 | 0001 | 1 2 | 0010 | 2 3 |
 * 0011 | (1+2) 4 | 0100 | 4 5 | 0101 | (1+4) 6 | 0110 | (2+4) 7 | 0111 |
 * (1+2+4) 8 | 1000 | 8 9 | 1001 | (1+8) 10 | 1010 | (2+8) 11 | 1011 | (1+2+8)
 * 12 | 1100 | (4+8) 13 | 1101 | (1+4+8) 14 | 1110 | (2+4+8) 15 | 1111 |
 * (1+2+4+8)
 *
 * 
 *
 */
public class SingleNumber {

    public static void main(String[] args) {

        int result = singleNumber(new int[]{1, 1, 2, 2, 4});
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result = result ^ i;
        }
        return result;

    }
}

/*
 public static int singleNumber(int[] nums){
  int result=0;
  for(int i=0;i<nums.length;i++){
  result=result^nums[i];
  }
  return result; 
  }
 */

 /*
Time complexity - O(n) --> because of 1 'for' loop
Space complexity - O(1) ---> no extra space needed
 */
