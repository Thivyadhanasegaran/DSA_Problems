/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given a singly linked list and a number k. Find the (n/k)th element, where n is the number of elements in the linked list. We need to consider ceil value in case of decimals.

Examples:

Input: LinkedList: 1->2->3->4->5->6 , k = 2
Output: 3
Explanation: 6/2th element is the 3rd(1-based indexing) element which is 3.

Input: 2->7->9->3->5 , k = 3
Output: 7
Explanation: The 5/3rd element is the 2nd element as mentioned in the question that we need to consider ceil value in the case of decimals. So 2nd element is 7.

Constraints: 
1 <= number of nodes <= 104
1 <= k <= number of nodes
1 ≤ node->data ≤ 103
 */
public class FindnkthnodeinLinkedlist {
   static class Node {
    int data;
    Node next;

    // Constructor
    Node(int key) {
        data = key;
        next = null;
    }
}

    public static int fractional_node(Node head, int k) {
        Node temp = head;
        double count = 0;

        // Count the total number of nodes
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        // Calculate the index of the fractional node
        int index = (int) Math.ceil(count / k);
        
        Node temp1 = head;
        
        // If index is 1, return the first node's data
        if (index == 1) {
            return temp1.data;
        }
        
        // Traverse to the fractional node
        for (int i = 1; i < index; i++) {
            if (temp1 != null) {
                temp1 = temp1.next;
            }
        }
        
        // Return the data of the fractional node
        return temp1 != null ? temp1.data : -1; // Return -1 if index is out of bounds
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        
        // Test the fractional_node method
        int k = 2; // Change this value to test with different fractions
        int result = fractional_node(head, k);
        
        // Output the result
        System.out.println("The fractional node for k = " + k + " is: " + result);
    }
}

