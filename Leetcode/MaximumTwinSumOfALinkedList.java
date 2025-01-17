/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin.

Given the head of a linked list with even length, return the maximum twin sum of the linked list.

 

Example 1:


Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6. 
Example 2:


Input: head = [4,2,2,3]
Output: 7
Explanation:
The nodes with twins present in this linked list are:
- Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
- Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
Thus, the maximum twin sum of the linked list is max(7, 4) = 7. 
Example 3:


Input: head = [1,100000]
Output: 100001
Explanation:
There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.

* 
* Reference: Video: https://www.youtube.com/watch?v=doj95MelfSA (only for idea of the probem)
* 
* Code: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/solutions/3840828/simple-java-solution-beats-100/?envType=study-plan-v2&envId=leetcode-75
 */
public class MaximumTwinSumOfALinkedList {
    // Definition for singly-linked list
static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


    public static int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode temp = slow;
        ListNode prev = null;
        ListNode next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        // Step 3: Calculate the twin sum and find the maximum
        int max = 0;
        while (prev != null) {
            max = Math.max(max, head.val + prev.val);
            head = head.next;
            prev = prev.next;
        }

        return max;
    }



    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 5 -> 4 -> 2 -> 1
        ListNode head = new ListNode(5, 
                          new ListNode(4, 
                          new ListNode(2, 
                          new ListNode(1))));

        System.out.println("Original List:");
        printList(head);

    
        int maxTwinSum = pairSum(head);

        System.out.println("Maximum Twin Sum: " + maxTwinSum);
    }
}
