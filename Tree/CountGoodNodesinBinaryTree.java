/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author thivya
 * 
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.

Return the number of good nodes in the binary tree.

 

Example 1:



Input: root = [3,1,4,3,null,1,5]
Output: 4
Explanation: Nodes in blue are good.
Root Node (3) is always a good node.
Node 4 -> (3,4) is the maximum value in the path starting from the root.
Node 5 -> (3,4,5) is the maximum value in the path
Node 3 -> (3,1,3) is the maximum value in the path.
Example 2:



Input: root = [3,3,null,4,2]
Output: 3
Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.
Example 3:

Input: root = [1]
Output: 1
Explanation: Root is considered as good.
* 
* Reference: video: https://www.youtube.com/watch?v=7cp5imvDzl4
* Code: https://leetcode.com/problems/count-good-nodes-in-binary-tree/solutions/635555/java-100-simple-easy-code-using-pre-order-tree-traversal/?envType=study-plan-v2&envId=leetcode-75
 */
public class CountGoodNodesinBinaryTree {
    
    // Definition for a binary tree node
    public static class TreeNode {
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

    public static class Solution {
        int count;
        
        public int goodNodes(TreeNode root) {
            count = 0;
            findGoodNodes(root, Integer.MIN_VALUE);
            return count;
        }

        public void findGoodNodes(TreeNode root, int max) {
            if (root == null) {
                return;
            }

            // If the current node's value is greater than or equal to the max value so far, it's a "good" node
            if (root.val >= max) {
                count++;
                max = Math.max(max, root.val);
            }

            // Recur for the left and right subtrees
            findGoodNodes(root.left, max);
            findGoodNodes(root.right, max);
        }
    }

    public static void main(String[] args) {
        // Test case
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        Solution solution = new Solution();
        int result = solution.goodNodes(root);
        System.out.println(result);  // Output: 4
    }
}
