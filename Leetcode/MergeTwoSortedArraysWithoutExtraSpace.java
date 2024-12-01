/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Arrays;

/**
 *
 * @author thivya
 */
public class MergeTwoSortedArraysWithoutExtraSpace {

    public static void main(String[] args) {
        long[] nums1 = {1, 4, 8, 10,0,0,0};
        long[] nums2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(nums1, nums2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
//        System.out.print("\narr2[] = ");
//        for (int i = 0; i < m; i++) {
//            System.out.print(arr2[i] + " ");
//        }
        System.out.println();
    }

    public static void merge(long[] nums1, long[] nums2, int m, int n) {
        
         int k =m+n -1;
       int i = m-1;
       int j = n-1;

       while(j>=0){
        if(i>=0 && nums1[i]>=nums2[j]){
            nums1[k] =nums1[i];
            i--;
            k--;
        }else
        {
            nums1[k]= nums2[j];
            j--;
            k--;
        }
       }
       
       
       
       
       
       
       
       //This is normal soring of array if input is arr1={2,5,8} arr2={4,9,1}
//        int left = n - 1;
//        int right = 0;
//
//        while (left >= 0 && right < m) {
//            if (arr1[left] > arr2[right]) {
//                long temp = arr1[left];
//                arr1[left] = arr2[right];
//                arr2[right] = temp;
//                left--;
//                right++;
//
//            } else {
//                break;
//            }
//
//        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);

/*Time Complexity: O(min(n, m)) + O(n*logn) + O(m*logm), 
where n and m are the sizes of the given arrays.
Reason: O(min(n, m)) is for swapping the array elements.
And O(n*logn) and O(m*logm) are for sorting the two arrays.

Space Complexity: O(1) as we are not using any extra space.*/



    }
}


