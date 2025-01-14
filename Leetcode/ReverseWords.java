/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

Note: The last character has not been '.'. 

Examples :

Input: str = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i

 */
public class ReverseWords {
    // Function to reverse words in a given string
    public String reverseWords(String str) {
        String[] arr = str.split("\\.");
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
        
        return String.join(".", arr);
    }
    
    // Helper function to swap elements in the array
    public void swap(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        
        String input = "hello.world.this.is.java";
        System.out.println("Original String: " + input);
        
        String reversed = rw.reverseWords(input);
        System.out.println("Reversed String: " + reversed);
    }
}
