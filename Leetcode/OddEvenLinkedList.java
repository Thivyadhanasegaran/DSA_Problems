/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]

* 
* Reference: https://www.youtube.com/watch?v=WoUAs7R3Ao4
 */
public class OddEvenLinkedList {
    // Definition for singly-linked list
static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


    public static ListNode oddEvenList(ListNode head) {
        // Edge case: If the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head; // Pointer for odd-indexed nodes
        ListNode even = head.next; // Pointer for even-indexed nodes
        ListNode evenHead = even; // Store the head of even list

        // Rearrange nodes
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        // Connect the end of odd-indexed list to the head of even-indexed list
        odd.next = evenHead;

        return head;
    }



    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, 
                          new ListNode(2, 
                          new ListNode(3, 
                          new ListNode(4, 
                          new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);


        head = oddEvenList(head);

        System.out.println("List after rearranging odd and even nodes:");
        printList(head);
    }
}

/*
Time Complexity: O(n) — Each node is traversed once.
Space Complexity: O(1) — No extra space is used, only pointers are rearranged.
*/