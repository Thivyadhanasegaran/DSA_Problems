/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given the head of a linked list that may contain a loop.  A loop means that the last node of the linked list is connected back to a node in the same list.  So if the next of the previous node is null. then there is no loop.  Remove the loop from the linked list, if it is present (we mainly need to make the next of the last node null). Otherwise, keep the linked list as it is.

Note: Given an integer, pos (1 based index)  Position of the node to which the last node links back if there is a loop. If the linked list does not have any loop, then pos = 0.

The generated output will be true if your submitted code is correct, otherwise, false.

Examples:

Input: Linked list: 1->3->4, pos = 2
Output: true
Explanation: The linked list looks like

A loop is present. If you remove it successfully, the answer will be true. 
Input: Linked list: 1->8->3->4, pos = 0
Output: true
Explanation: 

The Linked list does not contains any loop. 
Input: Linked list: 1->2->3->4, pos = 1
Output: true
Explanation: The linked list looks like 

A loop is present. If you remove it successfully, the answer will be true. 
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
* 
 */
public class RemoveloopinLinkedList {
   static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    public static void removeLoop(Node head) {
        if (head == null || head.next == null) {
            return; // No loop if the list is empty or has only one node
        }

        Node slow = head;
        Node fast = head;

        // Detect loop using Floyd’s cycle-finding algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, there is a loop
            if (slow == fast) {
                slow = head;
                removeLoop(slow, fast);
                return; // Exit after removing the loop
            }
        }
    }

    // Helper function to remove the loop
    public static void removeLoop(Node slow, Node fast) {
        // Case when loop does not start at the head of the list
        if (slow != fast) {
            
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null; // Break the loop
        } else {
            // Case when the loop starts at the head of the list
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null; // Break the loop
        }
    }

    // Helper function to print the list (for testing)
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example to test the code
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(2);
        head.next.next.next.next = head.next; // Creates a loop at node 3

        System.out.println("Linked list before removing loop:");
        // We cannot print the list directly as it has a loop, so let's only check for removal
        removeLoop(head);

        // Print list to confirm loop is removed
        System.out.println("Linked list after removing loop:");
        printList(head);
    }
}

