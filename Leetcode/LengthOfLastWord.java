/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String input = " Hello World";
        input = input.trim();
        int length = lengthOfLastWordFunction(input);
        System.out.println("The length of last word is: " + length);
    }

    public static int lengthOfLastWordFunction(String input) {
        int length = 0;

        if(input == null || input.isEmpty()) {
            return 0; 
        }
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ') {
                break;
            } else {
                length++;
            }
        }
        return length;
    }   
}



 /*Time Complexity
The time complexity of the lengthOfLastWordFunction method is O(n), where n is the length of the input string.

The trim() method, which is called once, has a time complexity of O(n).
The for loop iterates from the end of the string to the beginning, which in the worst case
(if there are no spaces) will traverse the entire string, making it O(n).
Since these operations are sequential, the overall time complexity remains O(n).

Space Complexity
The space complexity of the lengthOfLastWordFunction method is O(1).

The trim() method creates a new string, but this space is dependent on the input size and 
not additional space used by the algorithm.
The function itself uses a constant amount of extra space: a single integer variable length.
Therefore, the space complexity is O(1), as it uses a constant amount of extra space regardless of the input size.

Summary
Time Complexity: O(n)
Space Complexity: O(1)
 */
