/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 */
public class MoveAllZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
    }

//    public static int[] moveZeros(int n, int[] a) {
//        int j = -1;
//        //place the pointer j:
//        for (int i = 0; i < n; i++) {
//            if (a[i] == 0) {
//                j = i;
//                break;
//            }
//        }
//
//        //no non-zero elements:
//        if (j == -1) {
//            return a;
//        }
//
//        //Move the pointers i and j
//        //and swap accordingly:
//        for (int i = j + 1; i < n; i++) {
//            if (a[i] != 0) {
//                //swap a[i] & a[j]:
//                int tmp = a[i];
//                a[i] = a[j];
//                a[j] = tmp;
//                j++;
//            }
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//        int n = 10;
//        int[] ans = moveZeros(n, arr);
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans[i] + " ");
//        }
//        System.out.println("");
//    }
}


 /*Output: 1 2 3 2 4 5 1 0 0 0*/

 /*Complexity Analysis
Time Complexity: O(N), N = size of the array.
Reason: We have used 2 loops and using those loops, we are basically traversing the array once.

Space Complexity: O(1) as we are not using any extra space to solve this problem.*/
