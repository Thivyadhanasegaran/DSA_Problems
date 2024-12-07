/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author thivya
 * 
 * You are given an array of CPU tasks, each labeled with a letter from A to Z, and a number n. Each CPU interval can be idle or allow the completion of one task. Tasks can be completed in any order, but there's a constraint: there has to be a gap of at least n intervals between two tasks with the same label.

Return the minimum number of CPU intervals required to complete all tasks.

 

Example 1:

Input: tasks = ["A","A","A","B","B","B"], n = 2

Output: 8

Explanation: A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.

After completing task A, you must wait two intervals before doing A again. The same applies to task B. In the 3rd interval, neither A nor B can be done, so you idle. By the 4th interval, you can do A again as 2 intervals have passed.

Example 2:

Input: tasks = ["A","C","A","B","D","B"], n = 1

Output: 6

Explanation: A possible sequence is: A -> B -> C -> D -> A -> B.

With a cooling interval of 1, you can repeat a task after just one other task.

Example 3:

Input: tasks = ["A","A","A", "B","B","B"], n = 3

Output: 10

Explanation: A possible sequence is: A -> B -> idle -> idle -> A -> B -> idle -> idle -> A -> B.

There are only two types of tasks, A and B, which need to be separated by 3 intervals. This leads to idling twice between repetitions of these tasks.

 

Constraints:

1 <= tasks.length <= 104
tasks[i] is an uppercase English letter.
0 <= n <= 100
* 
*/
public class TaskScheduler {
     public static int leastInterval(char[] tasks, int n) {
        // Array to count the frequency of each task
        int[] taskCount = new int[26];
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }

        // Max heap to store the task frequencies in descending order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int value : taskCount) {
            if (value > 0) {
                maxHeap.add(value);
            }
        }

        // Time tracker
        int time = 0;

        // Queue to keep track of tasks in cooldown
        Queue<int[]> q = new LinkedList<>();

        while (!maxHeap.isEmpty() || !q.isEmpty()) {
            time++; // Increment time

            if (maxHeap.isEmpty()) {
                time = q.peek()[1]; // Fast-forward to the next available time
            } else {
                int count = maxHeap.poll() - 1; // Process a task
                if (count > 0) {
                    q.add(new int[] { count, time + n }); // Add to cooldown
                }
            }

            // Check if any task's cooldown period has ended
            if (!q.isEmpty() && q.peek()[1] == time) {
                maxHeap.add(q.poll()[0]); // Reinsert into the heap
            }
        }

        return time; // Return the total time
    }

    public static void main(String[] args) {
   
        // Example input
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;

        // Compute the least interval
        int result = leastInterval(tasks, n);

        // Output the result
        System.out.println("Least interval to complete all tasks: " + result);
    }
}
