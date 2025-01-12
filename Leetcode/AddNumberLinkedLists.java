/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given two numbers, num1, and num2, represented by linked lists. The task is to return the head of the linked list representing the sum of these two numbers.

For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

Examples:

Input: num1 = 45 (4->5->null), num2 = 345 (3->4->5->null)
Output:  3->9->0->null  
 
Explanation: 
For the given two linked list (4 5) and (3 4 5), after adding the two linked list resultant linked list will be (3 9 0).
Input: num1 = 0063 (0->0->6->3->null), num2 = 07 (0->7->null)
Output: 7->0->null
 
Explanation: 
For the given two linked list (0 0 6 3) and (0 7), after adding the two linked list resultant linked list will be (7 0).
Expected Time Complexity: O(n+m)
Expected Space Complexity: O(max(n,m)) for the resultant list.
* 
* 
 */
public class AddNumberLinkedLists {
    static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    // Function to add two numbers represented by linked lists
    static Node addTwoLists(Node num1, Node num2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        Node input1 = reverseNode(num1);
        Node input2 = reverseNode(num2);
        int carry = 0;

        while (input1 != null || input2 != null || carry != 0) {
            int sum = carry;

            if (input1 != null) {
                sum += input1.data;
                input1 = input1.next;
            }

            if (input2 != null) {
                sum += input2.data;
                input2 = input2.next;
            }

            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            temp.next = newNode;
            temp = temp.next;
        }

        return reverseNode(dummy.next);
    }

    // Helper function to reverse a linked list
    public static Node reverseNode(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
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
        // Create first number represented by linked list: 7 -> 5 -> 9 (represents 957)
        Node num1 = new Node(7);
        num1.next = new Node(5);
        num1.next.next = new Node(9);

        // Create second number represented by linked list: 8 -> 4 -> 2 (represents 248)
        Node num2 = new Node(8);
        num2.next = new Node(4);
        num2.next.next = new Node(2);

        System.out.println("First number:");
        printList(num1);

        System.out.println("Second number:");
        printList(num2);

        // Add the two numbers
        Node result = addTwoLists(num1, num2);

        System.out.println("Sum of the two numbers:");
        printList(result);
    }
}

