/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashSet;

/**
 *
 * @author thivya
 * 
 * You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.

 

Example 1:

Input: nums = [1,2,3], head = [1,2,3,4,5]

Output: [4,5]

Explanation:



Remove the nodes with values 1, 2, and 3.

Example 2:

Input: nums = [1], head = [1,2,1,2,1,2]

Output: [2,2,2]

Explanation:



Remove the nodes with value 1.

Example 3:

Input: nums = [5], head = [1,2,3,4]

Output: [1,2,3,4]

Explanation:



No node has value 5.


 */
public class DeleteNodesFromLinkedListPresentinArray {
    // Definition for singly-linked list.
static class ListNode {
    int val;
    ListNode next;

    // Constructors for the ListNode class
    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// Actual code

public static ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements from nums to a HashSet for quick lookup
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        // Iterate through the linked list
        while (head != null) {
            // If the current node's value is not in the set, add it to the result list
            if (!set.contains(head.val)) {
                curr.next = head;
                curr = curr.next;
            }
            // Move to the next node
            head = head.next;
            // Disconnect the current node to avoid accidental linking
            curr.next = null;
        }

        // Return the modified list starting after the dummy node
        return dummy.next;
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        // Array of values to be removed
        int[] nums = {6, 3};

        System.out.println("Original List:");
        printList(head);

        // Modifying the list by removing nodes with values in nums
        ListNode modifiedHead = modifiedList(nums, head);

        System.out.println("Modified List:");
        printList(modifiedHead);
    }
}
