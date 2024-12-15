/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author thivya
 * 
 * Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
* 

 */
public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        // Example tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node2, node3);

   
        int depth = maxDepth(root);
        System.out.println("The maximum depth of the tree is: " + depth); // Expected output: 3
    }
    
   static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { 
        this.val = val; 
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    //Actual code
   
     public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int maxDepth = 1 + Math.max(left,right);

        return maxDepth;
    }
}


/*
Time Complexity: O(N)
Space Complexity: O(N)
*/