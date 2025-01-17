/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * Given a linked list where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to the head side, 2s at the end of the linked list, and 1s in the middle of 0s and 2s.

Examples:

Input: LinkedList: 1->2->2->1->2->0->2->2
Output: 0->1->1->2->2->2->2->2
Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between.
 
Input: LinkedList: 2->2->0->1
Output: 0->1->2->2
Explanation: After arranging all the 0s,1s and 2s in the given format, the output will be 0 1 2 2.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
* 
* Reference Video: https://www.youtube.com/watch?v=gRII7LhdJWc
 */
public class Sortalinkedlistof0s1sand2s {
    static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    // Function to sort a linked list of 0s, 1s and 2s
    static Node segregate(Node head) {
        Node temp = head;
        
        int count0 = 0, count1 = 0, count2 = 0;
        
        // Count the number of 0s, 1s, and 2s
        while (temp != null) {
            if (temp.data == 0) {
                count0++;
            } else if (temp.data == 1) {
                count1++;
            } else {
                count2++;
            }
            temp = temp.next;
        }
        
        // Update the list with 0s, followed by 1s, and then 2s
        temp = head;
        
        while (count0 > 0) {
            temp.data = 0;
            temp = temp.next;
            count0--;
        }
        
        while (count1 > 0) {
            temp.data = 1;
            temp = temp.next;
            count1--;
        }
        
        while (count2 > 0) {
            temp.data = 2;
            temp = temp.next;
            count2--;
        }
        
        return head;
    }

    // Helper function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a linked list with values 0, 1, and 2 in random order
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);

        System.out.println("Original list:");
        printList(head);

        // Segregate and sort the list
        head = segregate(head);

        System.out.println("Sorted list:");
        printList(head);
    }
}

