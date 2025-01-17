/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * You are given the root of a binary tree.

A ZigZag path for a binary tree is defined as follow:

Choose any node in the binary tree and a direction (right or left).
If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
Change the direction from right to left or from left to right.
Repeat the second and third steps until you can't move in the tree.
Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).

Return the longest ZigZag path contained in that tree.

 

Example 1:


Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
Output: 3
Explanation: Longest ZigZag path in blue nodes (right -> left -> right).
Example 2:


Input: root = [1,1,1,null,1,null,null,1,1,null,1]
Output: 4
Explanation: Longest ZigZag path in blue nodes (left -> right -> left -> right).
Example 3:

Input: root = [1]
Output: 0
* 
* Reference: Video(for concept) https://www.youtube.com/watch?v=jdArJOUsIYg
* Code: https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/solutions/3702225/intuitive-approach-with-explanation-java-beats-99/?envType=study-plan-v2&envId=leetcode-75
 */
public class LongestZigZagPathInABinaryTree {
    static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
// Actual code
    static int max = 0;

    public static int longestZigZag(TreeNode root) {
        if (root == null)
            return 0;

        fnLongestZigZag(root.left, true, 1);
        fnLongestZigZag(root.right, false, 1);
        return max;
    }

    public static void fnLongestZigZag(TreeNode root, Boolean isLeft, int sum) {
        if (root == null)
            return;

        max = Math.max(max, sum);
        int leftSum = isLeft ? 1 : sum + 1;
        int rightSum = !isLeft ? 1 : sum + 1;

        fnLongestZigZag(root.left, true, leftSum);
        fnLongestZigZag(root.right, false, rightSum);
    }
    
    //Code ends here

    public static void main(String[] args) {
       

        // Create test binary tree
        /*
                1
               / \
              2   3
               \   \
                4   5
               /     \
              6       7
        */
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(4, new TreeNode(6), null)),
                new TreeNode(3, null, new TreeNode(5, null, new TreeNode(7))));

        int result = longestZigZag(root);
        System.out.println("Longest ZigZag Path Length: " + result);
    }
}
