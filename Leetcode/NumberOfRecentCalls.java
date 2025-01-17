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
 * You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.

 

Example 1:

Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3

* 
* Reference: Code: https://leetcode.com/problems/number-of-recent-calls/solutions/594800/question-and-solution-both-clearly-explained/?envType=study-plan-v2&envId=leetcode-75
* Video: https://www.youtube.com/watch?v=NtNeA48tJDk(for concept)
 */
public class NumberOfRecentCalls {

    Queue<Integer> q;

    public NumberOfRecentCalls() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }

        return q.size();
    }



    public static void main(String[] args) {
        NumberOfRecentCalls counter = new NumberOfRecentCalls();

        // Simulate the pings
        System.out.println("Ping at t=1: " + counter.ping(1)); // Output: 1
        System.out.println("Ping at t=100: " + counter.ping(100)); // Output: 2
        System.out.println("Ping at t=3001: " + counter.ping(3001)); // Output: 3
        System.out.println("Ping at t=3002: " + counter.ping(3002)); // Output: 3 (t=1 is removed)
        System.out.println("Ping at t=6000: " + counter.ping(6000)); // Output: 3 (t=100 is removed)
    }
}
