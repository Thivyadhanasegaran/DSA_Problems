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
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
* 

 */
public class MinStack {
    
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor to initialize the MinStack
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push a new value onto the stack
    public void push(int val) {
        stack.push(val);
        // Push the minimum value onto the minStack
        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());
        minStack.push(val);
    }

    // Pop the top value from both stacks
    public void pop() {
        stack.pop();
        minStack.pop();
    }

    // Get the top value of the stack
    public int top() {
        return stack.peek();
    }

    // Get the minimum value in the stack
    public int getMin() {
        return minStack.peek();
    }
}

// Main class to test the MinStack functionality
 class MinStackFn {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        
        // Pushing elements onto the stack
        minStack.push(5);
        System.out.println("Pushed: 5, Current Min: " + minStack.getMin());
        
        minStack.push(3);
        System.out.println("Pushed: 3, Current Min: " + minStack.getMin());
        
        minStack.push(7);
        System.out.println("Pushed: 7, Current Min: " + minStack.getMin());
        
        minStack.push(2);
        System.out.println("Pushed: 2, Current Min: " + minStack.getMin());
        
        // Display the top element
        System.out.println("Top element: " + minStack.top());

        // Pop the top element and check the min value
        minStack.pop();
        System.out.println("After pop, Current Min: " + minStack.getMin());
        
        minStack.pop();
        System.out.println("After pop, Current Min: " + minStack.getMin());
        
        // Display the top element again
        System.out.println("Top element: " + minStack.top());
    }
}
