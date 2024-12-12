/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author thivya
 * 
 * Given a binary tree, determine if it is 
height-balanced
.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:

Input: root = []
Output: true
* 

 */
public class BalancedBinaryTree {
   static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

    public static boolean isBalanced(TreeNode root) {
        return checkIsBalanced(root) != -1;
    }

    // Actual Code
    public static int checkIsBalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = checkIsBalanced(root.left);
        if (left == -1) return -1;

        int right = checkIsBalanced(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }


    public static void main(String[] args) {
        // Creating a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        boolean result = isBalanced(root);

        System.out.println("Is the tree balanced? " + result);
    }
}

