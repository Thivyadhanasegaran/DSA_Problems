/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thivya
 *
 * Given the root of a binary tree, return the postorder traversal of its nodes'
 * values.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,null,2,3] Output: [3,2,1] Example 2:
 *
 * Input: root = [] Output: [] Example 3:
 *
 * Input: root = [1] Output: [1]
 *
 *
 */
public class BinaryTreePostOrderTraversal {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        // Constructor to initialize the node with a value
        TreeNode(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Getting preorder traversal
        List<Integer> result = postorderTraversal(root);

        // Displaying the preorder traversal result
        System.out.print("Postorder Traversal: ");
        // Output each value in the preorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Function to initiate preorder traversal and return the resulting list
    static List<Integer> postorderTraversal(TreeNode root) {
        // Create an empty list to store preorder traversal values
        List<Integer> array = new ArrayList<>();
        // Call the preorder traversal function
        postorder(root, array);
        // Return the resulting list containing preorder traversal values
        return array;
    }

    // Function to perform preorder traversal of the tree and store values in 'array'
    static void postorder(TreeNode root, List<Integer> array) {
        // If the current node is NULL (base case for recursion), return
        if (root == null) {
            return;
        }

        // Recursively traverse the left subtree
        postorder(root.left, array);
        // Recursively traverse the right subtree
        postorder(root.right, array);
        // Push the current node's value into the list
        array.add(root.data);
    }
}
