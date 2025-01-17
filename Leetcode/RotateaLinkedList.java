/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given the head of a singly linked list, the task is to rotate the left shift of the linked list by k nodes, where k is a given positive integer smaller than or equal to the length of the linked list.

Examples:

Input: linkedlist: 2->4->7->8->9 , k = 3
Output: 8->9->2->4->7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7

Input: linkedlist: 1->2->3->4->5->6->7->8 , k = 4
Output: 5->6->7->8->1->2->3->4

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
 */
public class RotateaLinkedList {
   static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public static class LinkedListRotation {
    // Function to rotate the linked list by k nodes
    public Node rotate(Node head, int k) {
        Node temp = head;
       
       while(temp.next!=null){
           temp = temp.next;
       }
       
       for(int i=1;i<=k;i++){
           temp.next = head;
           head = head.next;
           temp = temp.next;
           temp.next = null;
       }
       return head;
    }

    // Helper function to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListRotation list = new LinkedListRotation();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(9);

        System.out.println("Original Linked List:");
        list.printList(head);

        int k = 3;  // Number of rotations
        head = list.rotate(head, k);

        System.out.println("Linked List after rotation by " + k + " positions:");
        list.printList(head);
    }
}
}
