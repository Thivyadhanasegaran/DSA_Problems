/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 */
public class ReverseLinkedList {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseLinkedListIterative(Node head) {
        // Initialize pointers
        Node prev = null;
        Node temp = head;
        Node front;

        // Traverse the list and reverse pointers
        while (temp != null) {
            // Store the next node
            front = temp.next;
            // Reverse the pointer
            temp.next = prev;
            // Move pointers one position ahead
            prev = temp;
            temp = front;
        }

        // prev now points to the new head of the reversed list
        return prev;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with values 1, 3, 2, and 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list iteratively
        head = reverseLinkedListIterative(head);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }

}
