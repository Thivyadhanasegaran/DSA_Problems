/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

import java.util.Arrays;

/**
 *
 * @author thivya
 * 
 * Refernce:Video https://www.youtube.com/watch?v=37E9ckMDdTk
 * Code: https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/
 */
public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
       //Optimal solution
        int largest = arr[0];
       int secLargest = -1;
       
       for(int i=1;i<arr.length;i++){
           if(arr[i]>largest){
               secLargest = largest;
               largest = arr[i];
           }else if(arr[i]>secLargest && arr[i]!=largest)
           secLargest = arr[i];
       }
       
       return secLargest;
        
      // Brute force method
        // Sort the array
//        Arrays.sort(arr);
//        // Iterate from the end to find the second largest unique element
//        for (int i = arr.length - 1; i > 0; i--) {
//            if (arr[i] > arr[i - 1]) {
//                return arr[i - 1];
//            }
//        }
//        // Return -1 if no second largest element exists
//        return -1;
    }

    public static void main(String[] args) {
        // Hardcoded input array
        int[] arr = {3, 5, 2, 9, 5, 2, 9};

        int secondLargest = getSecondLargest(arr);

        if (secondLargest != -1) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
