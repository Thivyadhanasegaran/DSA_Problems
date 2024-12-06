/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 * Class to remove the nth node from the end of a linked list.
 * 
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]

 * 

 */
public class RemoveNthNodeFromEndofList {
    
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        // Default constructor
        ListNode() {}

        // Constructor with value parameter
        ListNode(int val) {
            this.val = val;
        }

        // Constructor with value and next node parameter
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // Remove the 2nd node from the end (which is the node with value 4)
        ListNode newHead = removeNthFromEndofList(head, 2);

        // Print the resulting linked list
        printList(newHead);
    }

    
    /*-------------------Actual code-------------------------------*/
    
    // Method to remove the nth node from the end of the list
    public static ListNode removeNthFromEndofList(ListNode head, int n) {
        // Create a dummy node and set its next to head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // Initialize two pointers, both pointing to the dummy node initially
        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        // Move the second pointer n steps ahead
        for (int i = 0; i < n; i++) {
            secondPtr = secondPtr.next;
        }

        // Move both pointers one step at a time until the second pointer reaches the end
        while (secondPtr.next != null) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        // Skip the node that needs to be removed
        firstPtr.next = firstPtr.next.next;

        // Return the head of the modified list
        return dummy.next;
    }
    
  //Time complexity: O(N) (We will traverse the entire list only once )
  //Space complexity: O(1)
/*-------------------End of Actual code-------------------------------*/
    
    
    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
