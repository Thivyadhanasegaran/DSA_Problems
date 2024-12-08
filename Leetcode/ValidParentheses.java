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
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
* 

 */
public class ValidParentheses {

    public static void main(String[] args) {

        String input = "()[{}()]";
        boolean output = isValid(input);
        if (output == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isValid(String input) {
        Stack<Character> st = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

            char out = st.pop();

            if ((c == ')' && out == '(') || (c == ']' && out == '[' || c == '}' && out == '{')) {
               continue;
            } else {
               return false;
            }

            }

        }

        return st.isEmpty();
    }

}


//Time Complexity: O(N)

//Space Complexity: O(N)