/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given the head of a Singly Linked List and an index, The task is to find the node at the given index(1-based index) of the linked list. If no such index exists then return -1.

Examples :

Input: LinkedList: 1->2->3->4->5->6->7 , index = 3

Output: 3
Explanation: The Node value at index 3 is 3.
Input: LinkedList: 19->28->37->46->55 , index = 6

Output: -1
Explanation: As number of nodes are less than k so there is no node at index 6 , therefore our answer is -1.
* 
* 
 */
public class Nodeatagivenindexinlinkedlist {
    // Node class for linked list
static class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}


    // Method to get the Nth node's data in the linked list
    public static int GetNode(Node head, int index) {
        Node temp = head;

        // Traverse the list until the Nth node or end of list
        for (int i = 1; i < index && temp != null; i++) {
            temp = temp.next;
        }

        // If temp is null, index is out of bounds
        return (temp != null) ? temp.data : -1;
    }


    // Helper method to create a linked list from an array of values
    public static Node createLinkedList(int[] values) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
//        int[] values = {728, 279, 868, 363, 966, 212, 111, 329, 859}; // Linked list values
//        int index = 88; // Index to fetch (out of bounds example)
//        
//        int[] values = {1, 2, 3, 4, 5, 6, 7}; // Linked list values
//        int index = 3; // Index to fetch (out of bounds example)

 int[] values = {19, 28, 37, 46, 55}; // Linked list values
        int index = 6; // Index to fetch (out of bounds example)

        // Create the linked list from the array
        Node head = createLinkedList(values);

        // Initialize Solution and call GetNth
     
        int result = GetNode(head, index);

        // Output the result
        if (result != -1) {
            System.out.println("The data at index " + index + " is: " + result);
        } else {
            System.out.println("-1");
        }
    }
}

