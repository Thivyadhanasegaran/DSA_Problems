/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 

Example 1:

Input: head = [1,2,3,4]

Output: [2,1,4,3]

Explanation:



Example 2:

Input: head = []

Output: []

Example 3:

Input: head = [1]

Output: [1]

Example 4:

Input: head = [1,2,3]

Output: [2,1,3]
* 

 */
public class SwapNodesinPairs {
   static class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Actual code 
   
    // Function to swap every two adjacent nodes in the linked list
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode point = dummy;

        while (point.next != null && point.next.next != null) {
            ListNode swap1 = point.next;
            ListNode swap2 = point.next.next;

            // Swapping the pairs
            swap1.next = swap2.next;
            swap2.next = swap1;
            point.next = swap2;

            // Move pointer two nodes ahead for the next swap
            point = swap1;
        }
        return dummy.next;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print the original list
        System.out.println("Original list:");
        printList(head);

        ListNode swappedHead = swapPairs(head);

        // Print the swapped list
        System.out.println("List after swapping pairs:");
        printList(swappedHead);
    }
}

