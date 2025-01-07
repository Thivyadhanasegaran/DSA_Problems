/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 

Example 1:


Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node. 
Example 2:


Input: head = [1,2,3,4]
Output: [1,2,4]
Explanation:
The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.
Example 3:


Input: head = [2,1]
Output: [2]
Explanation:
The above figure represents the given linked list.
For n = 2, node 1 with value 1 is the middle node, which is marked in red.
Node 0 with value 2 is the only node remaining after removing node 1.
* 
**/
public class DeleteTheMiddleNodeOfALinkedList {
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
//Actual code
    public static ListNode deleteMiddle(ListNode head) {
        ListNode current = head;
        ListNode slow = current;
        ListNode fast = current;
        fast = fast.next.next;
 
        if(head==null || head.next==null){
             return null;
        }

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        
        slow.next = slow.next.next;
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


        head = deleteMiddle(head);

        System.out.println("List after deleting middle node:");
        printList(head);
    }
}
