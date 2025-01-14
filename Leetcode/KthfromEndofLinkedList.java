/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given the head of a linked list and the number k, Your task is to find the kth node from the end. If k is more than the number of nodes, then the output should be -1.

Examples

Input: LinkedList: 1->2->3->4->5->6->7->8->9, k = 2
Output: 8
Explanation: The given linked list is 1->2->3->4->5->6->7->8->9. The 2nd node from end is 8.

Input: LinkedList: 10->5->100->5, k = 5
Output: -1
Explanation: The given linked list is 10->5->100->5. Since 'k' is more than the number of nodes, the output is -1.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).
 */
public class KthfromEndofLinkedList {
    static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    // Function to find the data of k-th node from the end of a linked list
    public static int getKthFromLast(Node head, int k) {
        if (head == null) {
            return -1; // If list is empty, return -1
        }

        Node temp = head;
        int len = 1;

        // Calculate the length of the list
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        // If k is greater than the length of the list, return -1
        if (k > len) {
            return -1;
        }

        // Move `head` to the (len - k)th position to get the k-th node from the end
        for (int i = 1; i <= len - k; i++) {
            head = head.next;
        }

        // Return the data of the k-th node from the end
        return head.data;
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
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Test the getKthFromLast function
        int k = 2;
        int result = getKthFromLast(head, k);

        System.out.println("Linked list:");
        printList(head);
        
        System.out.println("The data of the " + k + "-th node from the end is: " + result);
    }
}

