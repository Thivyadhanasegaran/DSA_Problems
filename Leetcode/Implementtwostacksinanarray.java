/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Your task is to implement  2 stacks in one array efficiently. You need to implement 4 methods.

twoStacks : Initialize the data structures and variables to be used to implement  2 stacks in one array.
push1 : pushes element into first stack.
push2 : pushes element into second stack.
pop1 : pops element from first stack and returns the popped element. If first stack is empty, it should return -1.
pop2 : pops element from second stack and returns the popped element. If second stack is empty, it should return -1.

Example 1:

Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()
Output:
3 4 -1
Explanation:
push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1()   the poped element will be 3 from stack1 and stack1 will be {2}
pop2()   the poped element will be 4 from stack2 and now stack2 is empty
pop2()   the stack2 is now empty hence returned -1.
* 
 */
public class Implementtwostacksinanarray {
   static class TwoStacks {
    int size;
    int top1, top2;
    int[] arr;

    // Constructor
    TwoStacks() {
        size = 100;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    // Function to push an integer into stack1.
    void push1(int x) {
         arr[++top1] = x;
    }

    // Function to push an integer into stack2.
    void push2(int x) {
         arr[--top2] = x;
    }

    // Function to remove an element from top of stack1.
    int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            return -1; // Stack1 is empty
        }
    }

    // Function to remove an element from top of stack2.
    int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            return -1; // Stack2 is empty
        }
    }
}

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks();

        // Test input: push and pop operations
        ts.push1(2);   // Push 2 into stack1
        ts.push1(3);   // Push 3 into stack1
        System.out.print(ts.pop1() + " ");  // Pop from stack1 -> Output: 3

        ts.push2(4);   // Push 4 into stack2
        System.out.print(ts.pop2() + " ");  // Pop from stack2 -> Output: 4
        System.out.print(ts.pop2() + " ");  // Pop from stack2 -> Output: -1 (stack2 is empty)
    }
}

