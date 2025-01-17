/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.PriorityQueue;

/**
 *
 * @author thivya
 * 
 * You have a set which contains all positive integers [1, 2, 3, 4, 5, ...].

Implement the SmallestInfiniteSet class:

SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain all positive integers.
int popSmallest() Removes and returns the smallest integer contained in the infinite set.
void addBack(int num) Adds a positive integer num back into the infinite set, if it is not already in the infinite set.
 

Example 1:

Input
["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"]
[[], [2], [], [], [], [1], [], [], []]
Output
[null, null, 1, 2, 3, null, 1, 4, 5]

Explanation
SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set.
smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and
                                   // is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set.
* 
* Reference: Video: https://www.youtube.com/watch?v=b_Cmig4l6_c
* Code: https://leetcode.com/problems/smallest-number-in-infinite-set/solutions/3452079/easy-java-solution-using-minheap-and-count-beginner-friendly/?envType=study-plan-v2&envId=leetcode-75
 */
public class SmallestNumberInInfiniteSet {
    int current;
    PriorityQueue<Integer> minHeap;

    public SmallestNumberInInfiniteSet() {
        current = 1;
        minHeap = new PriorityQueue<>();
    }
    
    public int popSmallest() {
        if (!minHeap.isEmpty()) {
            return minHeap.poll();
        }
        return current++;
    }
    
    public void addBack(int num) {
        if (num < current && !minHeap.contains(num)) {
            minHeap.add(num);
        }
    }

    public static void main(String[] args) {
        SmallestNumberInInfiniteSet set = new SmallestNumberInInfiniteSet();
        
        // Pop some smallest numbers
        System.out.println("Pop: " + set.popSmallest()); // Output: 1
        System.out.println("Pop: " + set.popSmallest()); // Output: 2
        System.out.println("Pop: " + set.popSmallest()); // Output: 3
        
        // Add back a number
        set.addBack(2);
        System.out.println("Added back 2");
        
        // Pop again
        System.out.println("Pop: " + set.popSmallest()); // Output: 2 (since it was added back)
        System.out.println("Pop: " + set.popSmallest()); // Output: 4
        
        // Add back a number already passed
        set.addBack(1);
        System.out.println("Added back 1");
        System.out.println("Pop: " + set.popSmallest()); // Output: 1
        System.out.println("Pop: " + set.popSmallest()); // Output: 5
    }
}
