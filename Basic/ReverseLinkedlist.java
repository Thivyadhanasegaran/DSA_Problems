/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.LinkedList;

/**
 *
 * @author thivya How do you reverse a Linked List? Declare a linked list. Add
 * elements to that linked list. Apply the descending iterator method to the
 * linked list. This reverses the order of elements in the linked list.
 */
public class ReverseLinkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll.descendingIterator().forEachRemaining(ll1::add);
        System.out.println(ll1);
    }
}
