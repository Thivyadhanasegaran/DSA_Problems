/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya 
 * Given the head of a singly linked list, return true if it is a
 * palindrome or false otherwise.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,2,2,1] Output: true Example 2:
 *
 *
 * Input: head = [1,2] Output: false
 */
public class PalindromeLinkedList {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        ListNode head = createLinkedList(nums);
        boolean result = isPalindrome(head);
        if (result == true) {
            System.out.println("The LinkedList is a Palindrome");
        } else {
            System.out.println("The LinkedList is not a Palindrome");
        }
    }

    public static boolean isPalindrome(ListNode head) {
        
        
         ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast!=null){
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while(slow!=null){
            if(slow.val != fast.val)
            return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
        
     /*--------------   (OR)   ------------------------*/
        
//        ListNode slow = head;
//        ListNode fast = head;
//        int len = 0;
//        for (ListNode curr = head; curr != null; curr = curr.next) {
//            len++;
//        }
//
//        //Get hold of mid of linked list
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        // If the number of elements in linked list is odd
//        if (len % 2 != 0) {
//            slow = slow.next;
//        }
//
//        // Reverse the second half of the linked list
//        ListNode secondHlfHead = reverse(slow);
//
//        while (head != null && secondHlfHead != null) {
//            if (head.val != secondHlfHead.val) {
//                return false;
//            }
//            head = head.next;
//            secondHlfHead = secondHlfHead.next;
//        }
//        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode front;

        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static ListNode createLinkedList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }
}


/*
Time Complexity - O(N) - because it iterates each element in the linked list
Space Complexity - O(1) - because we are not using any additional space, as we
are only reversing the half of the linked list to compare without creating extra space
 */
