/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import leetCode.PalindromeLinkedList.ListNode;

/**
 *
 * @author thivya You are given two non-empty linked lists representing two
 * non-negative integers. The digits are stored in reverse order, and each of
 * their nodes contains a single digit. Add the two numbers and return the sum
 * as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4] Output: [7,0,8] Explanation: 342 + 465 =
 * 807. Example 2:
 *
 * Input: l1 = [0], l2 = [0] Output: [0] Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]
 *
 * Reference: https://www.youtube.com/watch?v=LBVsXSMOIk4
 */
public class AddTwoNumbersLinkedList {

    static class ListNode {

        int val;
        ListNode next;

        // Constructors
        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    
    //--------This is the actual code----------//
    public  ListNode fnAddTwoNumbersLinkedList(ListNode n1, ListNode n2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        while (n1 != null || n2 != null || carry == 1) {
            int sum = 0;

            if (n1 != null) {
                sum = sum + n1.val;
                n1 = n1.next;
            }

            if (n2 != null) {
                sum = sum + n2.val;
                n2 = n2.next;
            }

            sum = sum + carry;

            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }

    //--------------------------------------------//
    
    
    
    public static void main(String[] args) {
        // Creating first number: 342 represented as 2 -> 4 -> 3
        ListNode n1 = new ListNode(2);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(3);

        // Creating second number: 465 represented as 5 -> 6 -> 4
        ListNode n2 = new ListNode(5);
        n2.next = new ListNode(6);
        n2.next.next = new ListNode(4);

        AddTwoNumbersLinkedList solution = new AddTwoNumbersLinkedList();
        ListNode result = solution.fnAddTwoNumbersLinkedList(n1, n2);

        // Printing the result
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}
