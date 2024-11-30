/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author thivya
 * 
 * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 

Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False
* 

 */
public class ImplementStackusingQueues {
   static class MyStack {


    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 1; i < q.size(); i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}


    public static void main(String[] args) {
   
        MyStack stack = new MyStack();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the top element
        System.out.println("Top element: " + stack.top()); // Should print 30

        // Popping elements
        System.out.println("Popped element: " + stack.pop()); // Should print 30
        System.out.println("Top element after pop: " + stack.top()); // Should print 20

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.empty()); // Should print false

        // Popping remaining elements
        stack.pop(); // Popping 20
        stack.pop(); // Popping 10

        // Checking if the stack is empty again
        System.out.println("Is stack empty? " + stack.empty()); // Should print true
    }


}