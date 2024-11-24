/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Stack;

/**
 *
 * @author thivya
 * 
 * 
 * Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

 

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
* 
* 

 */
public class DecodeString {
     public static void main(String[] args) {      
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s)); // Output: "aaabcbc"
    }
     
     public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = (k * 10) + (c - '0');
            } else if (c == '[') {
                numStack.push(k);
                k = 0;
                stringStack.push("[");
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder();
                while (!stringStack.peek().equals("[")) {
                    temp.insert(0, stringStack.pop());
                }
                stringStack.pop(); // remove the "["
                
                StringBuilder replacement = new StringBuilder();
                int count = numStack.pop();
                for (int i = 0; i < count; i++) {
                    replacement.append(temp);
                }
                stringStack.push(replacement.toString());
            } else {
                stringStack.push(String.valueOf(c));
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stringStack.empty()) {
            result.insert(0, stringStack.pop());
        }
        return result.toString();
    }
}



/*

StringBuilder is a class in Java that is used to create a mutable sequence of characters.
Unlike String, which is immutable (i.e., once created, its value cannot be changed),
StringBuilder can be modified after it is created. This makes StringBuilder more efficient
for situations where you need to perform many modifications to a string, such as appending,
inserting, or deleting characters.


Here's a brief explanation of the code snippet you provided:
StringBuilder temp = new StringBuilder();

This line creates a new StringBuilder object named temp. Initially, it is an empty
sequence of characters. You can then use various methods of StringBuilder to modify this sequence.

For example:

temp.append("Hello");
temp.append(" ");
temp.append("World");
System.out.println(temp.toString()); // Outputs "Hello World"


Common Methods of StringBuilder
1. append(String str): Adds the specified string to the end of the current sequence.
2. insert(int offset, String str): Inserts the specified string at the specified position.
3. delete(int start, int end): Removes the characters in the specified range.
4. replace(int start, int end, String str): Replaces the characters in the specified 
range with the specified string.
5. reverse(): Reverses the sequence of characters.
6. toString(): Converts the StringBuilder to a String.


Example Usage:

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder temp = new StringBuilder();

        temp.append("Hello");
        temp.append(" ");
        temp.append("World");
        System.out.println(temp.toString()); // Outputs "Hello World"

        temp.insert(5, ",");
        System.out.println(temp.toString()); // Outputs "Hello, World"

        temp.replace(7, 12, "Java");
        System.out.println(temp.toString()); // Outputs "Hello, Java"

        temp.reverse();
        System.out.println(temp.toString()); // Outputs "avaJ ,olleH"
    }
}
*/