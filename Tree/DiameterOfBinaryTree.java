/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;
 import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author thivya
 * 
 * Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

 

Example 1:


Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1

* 
 */
public class DiameterOfBinaryTree {
 

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

    public static void main(String[] args) {
        // Create an instance of the DiameterOfBinaryTree class
        DiameterOfBinaryTree diameterCalculator = new DiameterOfBinaryTree();

        // Create a sample binary tree:
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        DiameterOfBinaryTree.TreeNode root = diameterCalculator.new TreeNode(1);
        root.left = diameterCalculator.new TreeNode(2);
        root.right = diameterCalculator.new TreeNode(3);
        root.left.left = diameterCalculator.new TreeNode(4);
        root.left.right = diameterCalculator.new TreeNode(5);

        // Calculate the diameter of the binary tree
        int diameter = diameterCalculator.diameterOfBinaryTree(root);

        // Print the diameter
        System.out.println("Diameter of the binary tree: " + diameter);
    }

// Actual code starts here
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        int[] diameter = new int[1];
        functionDiameterOfBinaryTree(root,diameter);
        return diameter[0];
    }

    public static int functionDiameterOfBinaryTree(TreeNode root, int[] diameter){

        if(root==null)
        return 0;

        int left = functionDiameterOfBinaryTree(root.left, diameter);
        int right = functionDiameterOfBinaryTree(root.right, diameter);
        diameter[0] = Math.max(diameter[0], left+right);
        return 1+ Math.max(left,right);
    }
    }

// Using HashMap and Stack

//        HashMap<TreeNode, Integer> map = new HashMap<>();
//        Stack<TreeNode> stack = new Stack<>();
//        int diameter = 0;
//
//        if (root != null) {
//            stack.push(root);
//        }
//
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.peek();
//
//            if (node.left != null && !map.containsKey(node.left)) {
//                stack.push(node.left);
//            }
//            else if (node.right != null && !map.containsKey(node.right)) {
//                stack.push(node.right);
//            }
//            else {
//                stack.pop();
//                int leftDepth = map.getOrDefault(node.left, 0);
//                int rightDepth = map.getOrDefault(node.right, 0);
//                map.put(node, 1 + Math.max(leftDepth, rightDepth));
//                diameter = Math.max(diameter, leftDepth + rightDepth);
//            }
//        }
//
//        return diameter;
//    }

  
/*Time complexity: O(N)
Space complexity: O(N)
*/
