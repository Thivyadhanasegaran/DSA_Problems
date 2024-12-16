/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author thivya
 *
 *
 * You are given the root of a binary tree containing digits from 0 to 9 only.
 *
 * Each root-to-leaf path in the tree represents a number.
 *
 * For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
 * Return the total sum of all root-to-leaf numbers. Test cases are generated so
 * that the answer will fit in a 32-bit integer.
 *
 * A leaf node is a node with no children.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,2,3] Output: 25 Explanation: The root-to-leaf path 1->2
 * represents the number 12. The root-to-leaf path 1->3 represents the number
 * 13. Therefore, sum = 12 + 13 = 25. Example 2:
 *
 *
 * Input: root = [4,9,0,5,1] Output: 1026 Explanation: The root-to-leaf path
 * 4->9->5 represents the number 495. The root-to-leaf path 4->9->1 represents
 * the number 491. The root-to-leaf path 4->0 represents the number 40.
 * Therefore, sum = 495 + 491 + 40 = 1026.
 *
 * Reference video:https://www.youtube.com/watch?v=90jy-aWRhl0
 * Concept :https://www.youtube.com/watch?v=Jk16lZGFWxE
 */
public class SumRootToLeafNumbers {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }

    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Create a Solution object and calculate the sum of root-to-leaf numbers
        int result = sumNumbers(root);

        // Print the result
        System.out.println("Sum of root-to-leaf numbers: " + result);
    }

     static int totalSum = 0;

    public static int sumNumbers(TreeNode root) {
        sumLeaf(root, 0);
        return totalSum;
    }

    public static void sumLeaf(TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        sum = sum * 10 + root.val;

        if (root.left == null && root.right == null) {
            totalSum = totalSum + sum;
        }

        sumLeaf(root.left, sum);
        sumLeaf(root.right, sum);
    }

}
