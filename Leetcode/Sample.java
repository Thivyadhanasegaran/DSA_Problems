/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import static java.util.Map.entry;

/**
 *
 * @author thivya
 */
public class Sample {
// 1. Contains duplicate in array
//    public static void main(String args[]) {
//        int[] array = {2, 5, 3, 8};
//        boolean result = fn(array);
//        if (result == true) {
//            System.out.println("Array contains duplicates");
//        } else {
//            System.out.println("Array does not contains duplicates");
//        }
//    }
//
//    public static boolean fn(int[] array) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int num = 0; num < array.length; num++) {
//            if (set.contains(array[num])) {
//                return true;
//            } else {
//                set.add(array[num]);
//            }
//        }
//        return false;
//    }

    // 2. Length of Last Word
//    public static void main(String[] args) {
//        String input = "Hello World";
//        int length = fn(input);
//        System.out.println("Length of last word is: " + length);
//    }
//
//    public static int fn(String input) {
//        int length = 0;
//
//        for (int i = input.length() - 1; i >= 0; i--) {
//            if (input.charAt(i) == ' ') {
//                break;
//            } else {
//                length++;
//            }
//        }
//        return length;
//    }
    //3. Majority element in array
//    public static void main(String[] args) {
//        int[] array = {2, 3, 2, 4, 2, 2, 2};
//        int majElement = fn(array);
//        System.out.println("The majority element in the array is: " + majElement);
//    }
//
//    public static int fn(int[] array) {
//        int maj = 0;
//        int half = array.length / 2;
//
//        Map<Integer, Integer> mp = new HashMap<>();
//
//        for (int i = 0; i < array.length; i++) {
//            mp.put(array[i], mp.getOrDefault(array[i], 0) + 1);
//        }
//
//        for (Integer i : mp.keySet()) {
//            if (mp.get(i) > half) {
//                return i;
//            }
//
//        }
//        return -1;
//    }
    //4. MergeTwoSortedArraysWithoutExtraSpace
//    public static void main(String[] args) {
//        int[] a1 = {1, 3, 7, 9};
//        int[] a2 = {2, 6, 8};
//        int n = 4;
//        int m = 3;
//        fn(a1, a2, n, m);
//        System.out.print("Merged array is: a1[] = ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a1[i] + " ");
//        }
//        System.out.print("Merged array is: a2[] = ");
//        for (int i = 0; i < m; i++) {
//            System.out.print(a2[i] + " ");
//        }
//    }
//
//    public static void fn(int[] a1, int[] a2, int n, int m) {
//        int left = n - 1;
//        int right = 0;
//
//        while (left >= 0 && right < m) {
//            if (a1[left] > a2[right]) {
//                int temp = a1[left];
//                a1[left] = a2[right];
//                a2[right] = temp;
//                left--;
//                right++;
//            } else {
//                break;
//            }
//        }
//
//        Arrays.sort(a1);
//        Arrays.sort(a2);
//
//    }
    //5. Move all zeros
//    public static void main(String[] args) {
//        int[] array = {3, 6, 0, 8, 0, 3, 7, 0, 1, 0, 2};
//        fn(array);
//        System.out.println("Final array is: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }
//    }
//
//    public static void fn(int[] array) {
//        int j = -1;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                j = i;
//                break;
//            }
//        }
//
//        if (j == -1) {
//            return;
//        }
//
//        for (int i = j + 1; i < array.length; i++) {
//            if (array[i] != 0) {
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//                j++;
//            }
//
//        }
//
//    }
//    int data = 50;
//
//void change(int data){
//       this. data = data+100;
  //  }

    public static void main(String[] args) {
        
        String pattern ="100";
        String source = "codesignal";
        
        char a = pattern.charAt(0);
        char b = pattern.charAt(1);
        char c = pattern.charAt(2);
        int count = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<source.length();i++){
            if(source.charAt(i)=='a' || source.charAt(i)=='e' || source.charAt(i)=='i' || source.charAt(i)=='o' || source.charAt(i)=='u' || source.charAt(i)=='y'){
                str.append('0');
            }else
                 str.append('1');
        }
         System.out.println(str);
        for(int i=1;i<str.length()-1;i++){
           
            if(str.charAt(i)==b && str.charAt(i-1)==a && str.charAt(i+1)==c){
             
                count++;
            }
        }
        
        System.out.println(count);
        
//        Sample s = new Sample();
//        System.out.println(s.data);
//        s.change(50);
//        System.out.println(s.data);
        
        
        //int num = 123456789;
        //int num = 121;
        // Count digits in a number
//        int result = 0;
//        while (num != 0) {
//
//            result++;
//            num = num / 10;
//        }
//
//        System.out.println(result);
//    }

        //Reverse Digits of A Number
//    int result = 0;
//    while(num!=0){
//
//        int digit = num%10;
//        result = result*10 + digit;
//        num = num/10;
//    }
//         System.out.println(result);
//}
        //Check if a number is Palindrome or Not
//    int result = 0;
//    int input = num;
//    while(input!=0){
//        int digit = input%10;
//        result = result*10 + digit;
//        input = input/10;
//    }
//
//    if(result==num)
//        System.out.println("true");
//    else
//        System.out.println("False");
//    }
//Find GCD of two numbers
//        int a = 20, b = 15;
//
//        while (a > 0 && b > 0) {
//            if (a > b) {
//                a = a % b;
//            } else {
//                b = b % a;
//            }
//        }
//
//        if (a == 0) {
//            System.out.println(b);
//           // return b;
//        } else {
//             System.out.println(a);
//           // return a;
//        }
        //Check if a number is Armstrong Number or not
//        int num = 153;
//        int outputCheck = num;
//
//        int result = 0;
//        int input = num;
//        while(num!=0){
//        digit++;
//        num = num/10;
//        }
//   int digit = String.valueOf(num).length();
//
//        while(input!=0){
//        int d = input%10;
//        result = result + (int) Math.pow(d,digit);
//        input = input/10;
//        }
//
//        if(result==outputCheck)
//            System.out.println("true");
//        else
//            System.out.println("False");
//    }
        //Print Name N times using Recursion
//        String name = "Thivya";
//        int num = 10;
//
//        fn(1, name, num);
//    }
//
//    public static void fn(int initial, String name, int num) {
//        if (initial > 10) {
//            return;
//        }
//        System.out.println(name);
//        fn(initial + 1, name, num);
//    }
        //Print 1 to N using Recursion
//    int n = 10;
//    fn(1,n);
//    }
//
//    public static void fn(int from, int n){
//    if(from<=n){
//    System.out.println(from);
//    from++;
//    fn(from,n);
//    }
//    }
        //Print N to 1 using Recursion
//    int n = 10;
//    fn(n);
//    }
//    public static void fn(int n){
//       if(n==0)return;
//
//       System.out.println(n);
//       n--;
//       fn(n);
//
//    }
        //Sum of first N Natural Numbers
//    int n = 5;
//    int sum = fnSum(n);
//    System.out.println(sum);
//    }
        //  public static int fnSum(int n){
//        if(n<1)return 0;
//
//
//
//       int sum = n + fnSum(n-1);
//
//       return sum;
//using for loop
//       int sum=0;
//for(int i=1; i<=n;i++){
//sum = sum + i;
//
//}
//    return sum;
//
//    }
//
        //Factorial of a Number :  Recursive
//    int n =5;
//    int result = fn(n);
//    System.out.println(result);
//    }
//    public static int fn(int n){
//    if(n<1)return 1;
//
//    int result = n * fn(n-1);
//    return result;
// //Factorial of a Number : Iterative
//int n =5;
//int result = fn(n);
//System.out.println(result);
//    }
//
//    public static int fn(int n){
//         int sum = 1;
//    for(int i =n;i>0;i--){
//
//    sum = sum *i;
//    }
//    return sum;
//Reverse a given Array
//int[] nums = {1,2,3,4,5};
//
////for(int i=nums.length-1;i>=0;i--){
////System.out.println(nums[i]);
////}
//
//int[] out = new int[nums.length];
//
//for(int i=nums.length-1;i>=0;i--){
//out[i] = nums[i];
//}
//
//for(int i=out.length-1;i>=0;i--){
//System.out.println(out[i]);
//}
//int start = 0;
//int end = nums.length-1;
//
//while(start<end){
//int temp= nums[start];
//nums[start] = nums[end];
//nums[end]= temp;
//start++;
//end--;
//}
//for(int i=0;i<nums.length;i++){
//    System.out.println(nums[i]);
//}
//Print Fibonacci Series up to Nth term
//int n = 5;
//fn(n);
//
//    }
//
//    public static void fn(int n){
//    //using loop
//
//    int[] nums = new int[n+1];
//
//    nums[0]=0;
//    nums[1]=1;
//
//    for(int i=2;i<nums.length;i++){
//    nums[i] = nums[i-1]+nums[i-2];
//    }
//
//    for(int i=0;i<nums.length;i++){
//System.out.println(nums[i]);}
//        if(n==0 || n==1)return 1;
//
//        return (n + fn(n-1));
//Count frequency of each element in the array
//        int[] nums = {10, 5, 15, 10, 10, 5};
//
//        HashMap<Integer, Integer> mp = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
//        }
//for(int i=0; i<nums.length;i++){
//System.out.println(mp.get(nums[i]));
//}
//for(Integer i : mp.keySet())
//    System.out.println(i + "is" + mp.get(i));
//
//    }
//for(Map.Entry<Integer,Integer> i : mp.entrySet())
//    System.out.println(i.getKey() + "is" + i.getValue());
//
//    }
//int minElem=0, maxElem=0;
//int minCount=nums.length, maxCount=0;
//
//for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
//int ele = entry.getKey();
//int count = entry.getValue();
//
//if(count>maxCount){
//maxCount = count;
//maxElem = ele;
//}
//else if(count< minCount)
//{
//    minCount = count;
//    minElem = ele;
//
//
//}
//
//
//}
//     System.out.println("Min elem is:" + minElem + "and count is "+ minCount);
//System.out.println("Max elem is:" + maxElem + "and count is "+ maxCount);
//
// Bubble sort
//        int[] nums = {2, 7, 1, 6, 9, 4};
//
//        for (int i = nums.length - 1; i > 0; i--) {
//            for (int j = 0; j < nums.length-1; j++) {
//
//                if(nums[j]>nums[j+1]){
//                int temp = nums[j];
//                nums[j] = nums[j + 1];
//                nums[j + 1] = temp;
//                }
//
//            }
//        }
//
//        for(int i =0;i<nums.length;i++){
//        System.out.println(nums[i]);
//        }
//Selection sort
//        int[] nums = {2, 7, 1, 6, 9, 4};
//
//        for (int i = 0; i < nums.length; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[minIndex] > nums[j]) {
//                    minIndex = j;
//                }
//            }
//             if (i != minIndex) {
//                    int temp = nums[i];
//                    nums[i] = nums[minIndex];
//                    nums[minIndex] = temp;
//                }
//
//        }
//
//        for(int i=0; i<nums.length;i++){
//        System.out.println(nums[i]);
//        }
//Insertion sort
        // int[] nums = {2, 7, 1, 6, 9, 4};
// for(int i=0;i<nums.length;i++)
// {
//     for(int j=i+1;j<nums.length;j++){
//
//         if(nums[i]>nums[j]){
//         int temp = nums[i];
//         nums[i]=nums[j];
//         nums[j]=temp;
//         }
//
//     }
//        for (int i = 1; i < nums.length; i++) {
//            int temp = nums[i];
//            int j = i - 1;
//
//            while (j > -1 && temp < nums[j]) {
//
//                nums[j + 1] = nums[j];
//                nums[j] = temp;
//                j--;
//            }
//        }
//
//        for (int i=0;i<nums.length;i++){
//        System.out.println(nums[i]);}
//Bubble Sort
//        int[] nums = {2, 5, 8, 1, 3};
//
//        for (int i = nums.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if(nums[j]>nums[j+1])
//                {
//                  int temp = nums[j];
//                  nums[j] = nums[j+1];
//                  nums[j+1] = temp;
//                }
//            }
//        }
//
//        for(int i=0; i<nums.length;i++){
//        System.out.println(nums[i]);
//        }
// Selection Sort
//        int[] nums = {2, 5, 8, 1, 3};
//
//        for (int i = 0; i < nums.length; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[minIndex] > nums[j]) {
//                    minIndex = j;
//                }
//            }
//            if(i!=minIndex){
//            int temp = nums[i];
//            nums[i] = nums[minIndex];
//            nums[minIndex] = temp;
//            }
//
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out
//            .println(nums[i]);
//
//        }
// Insertion sort
//        int[] nums = {2, 5, 8, 1, 3};
//
//        for (int i = 1; i < nums.length; i++) {
//            int j = i - 1;
//            int temp = nums[i];
//
//            while (j > -1 && nums[j] > temp) {
//                nums[j + 1] = nums[j];
//                nums[j] = temp;
//                j--;
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
// Quick sort
//        int[] nums = {4, 6, 1, 7, 3, 2, 5};
//
//        int firstIndex = 0;
//        int secondIndex = nums.length - 1;
//        quickSort(nums, firstIndex, secondIndex);
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//
//        }
//
//    }
//
//    public static void quickSort(int[] nums, int left, int right) {
//        if (left < right) {
//            int swapIndex = pivot(nums, left, right);
//
//            quickSort(nums, left, swapIndex - 1);
//            quickSort(nums, swapIndex + 1, right);
//        }
//
//    }
//
//    public static void swap(int[] nums, int firstIndex, int secondIndex) {
//        int temp = nums[firstIndex];
//        nums[firstIndex] = nums[secondIndex];
//        nums[secondIndex] = temp;
//    }
//
//    public static int pivot(int[] nums, int pivotIndex, int endIndex) {
//
//        int swapIndex = pivotIndex;
//
//        for (int i = pivotIndex + 1; i <= endIndex; i++) {
//            if (nums[i] < nums[pivotIndex]) {
//                swapIndex++;
//
//                swap(nums, swapIndex, i);
//
//            }
//        }
//
//        swap(nums, swapIndex, pivotIndex);
//
//        return swapIndex;
//    }
// Merge sort
//        int[] originalArray = {1, 8, 7, 5};
//        int[] sortedArray = mergeSort(originalArray);
//
//        for (int num : sortedArray) {
//            System.out.println(num);
//        }
//        
//        System.out.println("Original Array: " + Arrays.toString(originalArray));
//        System.out.println("Sorted Array: "+ Arrays.toString(sortedArray));
//
//    }
//
//    public static int[] mergeSort(int[] array) {
//
//        if (array.length == 1) {
//            return array;
//        }
//
//        int midIndex = array.length / 2;
//
//        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
//        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
//
//        return merge(left, right);
//    }
//
//    public static int[] merge(int[] array1, int[] array2) {
//        int[] combined = new int[array1.length + array2.length];
//
//        int index = 0;
//        int i = 0;
//        int j = 0;
//
//        while (i < array1.length && j < array2.length) {
//
//            if (array1[i] < array2[j]) {
//                combined[index] = array1[i];
//                i++;
//                index++;
//
//            } else {
//
//                combined[index] = array2[j];
//                j++;
//                index++;
//            }
//
//        }
//
//        while (i < array1.length) {
//            combined[index] = array1[i];
//            i++;
//            index++;
//        }
//
//        while (j < array2.length) {
//            combined[index] = array2[j];
//            j++;
//            index++;
//
//        }
//        return combined;
//    }
//Find the Largest element in an array
//        int[] nums = {5, 3, 6, 9, 1};
//
//        int smallest = nums[0];
//        int largest = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > largest) {
//                largest = nums[i];
//            } else {
//                smallest = nums[i];
//            }
//        }
//        
//        
//        System.out.println(largest);
//        System.out.println(smallest);

//Arrays.sort(nums);
//System.out.println(nums[1]);
//System.out.println(nums[nums.length-2]);
//System.out.println(Arrays.toString(nums));

//Add Two Numbers Given as LinkedLists 

//sayHi(3);
//    }
//private static void sayHi(int count){
//    System.out.println(count);
//    
//    if(count<=1){
//        return;           
//}
//sayHi(count-1);
// System.out.println(count);






    }

}
