/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

import java.util.Stack;

/**
 *
 * @author thivya
 * 
 * You are given a string s representing an expression containing various types of brackets: {}, (), and []. Your task is to determine whether the brackets in the expression are balanced. A balanced expression is one where every opening bracket has a corresponding closing bracket in the correct order.

Examples :

Input: s = "{([])}"
Output: true
Explanation: 
- In this expression, every opening bracket has a corresponding closing bracket.
- The first bracket { is closed by }, the second opening bracket ( is closed by ), and the third opening bracket [ is closed by ].
- As all brackets are properly paired and closed in the correct order, the expression is considered balanced.
Input: s = "()"
Output: true
Explanation: 
- This expression contains only one type of bracket, the parentheses ( and ).
- The opening bracket ( is matched with its corresponding closing bracket ).
- Since they form a complete pair, the expression is balanced.
Input: s = "([]"
Output: false
Explanation: 
- This expression contains only one type of bracket, the parentheses ( and ).
- The opening bracket ( is matched with its corresponding closing bracket ).
- Since they form a complete pair, the expression is balanced.
* 
* 
 */
public class ParenthesisChecker {

        // Function to check if brackets are balanced or not.
     public static boolean isParenthesisBalanced(String s) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                
                if (ch == '{' || ch == '(' || ch == '[') {
                    st.push(ch); // Push opening brackets to the stack
                } else {
                    // Check if the stack is empty (no matching opening bracket)
                    if (st.isEmpty()) {
                        return false;
                    }
                    char topChar = st.pop();
                    // Check if the current closing bracket matches the top of the stack
                    if ((ch == '}' && topChar != '{') ||
                        (ch == ')' && topChar != '(') ||
                        (ch == ']' && topChar != '[')) {
                        return false;
                    }
                }
            }
            
            // Ensure the stack is empty (all brackets are matched)
            return st.isEmpty();
        }
    

    public static void main(String[] args) {
        // Test cases
        System.out.println(isParenthesisBalanced("{[()]}")); // true
        System.out.println(isParenthesisBalanced("{[(])}")); // false
        System.out.println(isParenthesisBalanced("{[("));    // false
        System.out.println(isParenthesisBalanced(""));       // true (empty string is balanced)
        System.out.println(isParenthesisBalanced("{[()]}{}"));// true
    }
}

