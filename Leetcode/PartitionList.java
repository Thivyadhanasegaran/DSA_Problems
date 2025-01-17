/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

 

Example 1:


Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
Example 2:

Input: head = [2,1], x = 2
Output: [1,2]

* 
* Reference: For video https://www.youtube.com/watch?v=KT1iUciJr4g
* For code: https://leetcode.com/problems/partition-list/solutions/1157797/js-python-java-c-easy-two-lists-solution-w-explanation/?envType=study-plan-v2&envId=top-interview-150
 */
public class PartitionList {
    
    // Definition for singly-linked list.
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

    public static ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();

        ListNode currentNode = head;
        ListNode leftNode = left;
        ListNode rightNode = right;

        while (currentNode != null) {
            if (currentNode.val < x) {
                leftNode.next = currentNode;
                leftNode = currentNode;
            } else {
                rightNode.next = currentNode;
                rightNode = currentNode;
            }
            currentNode = currentNode.next;
        }

        leftNode.next = right.next;
        rightNode.next = null;
        return left.next;
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        System.out.println("Original List:");
        printList(head);

       
        int x = 3; // Partition value
        ListNode result = partition(head, x);

        System.out.println("Partitioned List:");
        printList(result);
    }
    
}
