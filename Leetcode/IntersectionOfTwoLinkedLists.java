/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import leetCode.PalindromeLinkedList.ListNode;

/**
 *
 * @author thivya
 * 
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:


The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.
* 
* 
 */
public class IntersectionOfTwoLinkedLists {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null) {
                a = headB;
            } else
                a = a.next;

            if (b == null) {
                b = headA;
            } else
                b = b.next;
        }
        return a;
    }
    
}
