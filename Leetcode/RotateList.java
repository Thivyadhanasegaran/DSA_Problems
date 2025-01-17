/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
* 
* Reference video: https://www.youtube.com/watch?v=uT7YI7XbTY8
 */
public class RotateList {
   static class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
   
//Actual code for this problem
   
    // Function to rotate the linked list by k nodes
    public static ListNode rotateRight(ListNode head, int k) {
       
        if (head == null || head.next == null || k == 0) {
            return head;  // No rotation needed for empty list, single node, or k=0
        }

        // Find the length of the linked list
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // Calculate effective rotations needed (in case k > len)
        k = k % len;
        if (k == 0) {
            return head;  // No rotation needed if k is a multiple of the list length
        }

        // Connect the last node to the head to make it circular
        tail.next = head;

        // Find the new tail after skipping (len - k) nodes
        ListNode temp = head;
        for (int i = 1; i < len - k; i++) {
            temp = temp.next;
        }

        // Set the new head and break the circular link
        head = temp.next;
        temp.next = null;

        return head;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        int k = 2;  // Number of rotations
        head = rotateRight(head, k);

        System.out.println("Linked List after rotation by " + k + " positions:");
        printList(head);
    }
}

