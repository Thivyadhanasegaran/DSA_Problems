/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya Given an integer array nums and an integer val, remove all
 * occurrences of val in nums in-place. The order of the elements may be
 * changed. Then return the number of elements in nums which are not equal to
 * val.
 *
 * Consider the number of elements in nums which are not equal to val be k, to
 * get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the
 * elements which are not equal to val. The remaining elements of nums are not
 * important as well as the size of nums. Return k.
 *
 * Example 1:
 *
 * Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_] Explanation:
 * Your function should return k = 2, with the first two elements of nums being
 * 2. It does not matter what you leave beyond the returned k (hence they are
 * underscores).
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] num = {3, 2, 2, 3};
        int value = 3;
        int index = fnRemoveElement(num, value);
        System.out.println("The index is: " + index);
    }

    public static int fnRemoveElement(int[] num, int value) {
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != value) {
                num[index] = num[i];
                index++;
            }
        }
        return index;
    }
}

/*
Time complexity:
O(n)

Space complexity:
O(1)

 */
