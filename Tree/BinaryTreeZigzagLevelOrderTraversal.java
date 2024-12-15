/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author thivya

 */
public class BinaryTreeZigzagLevelOrderTraversal {
    
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


    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                // Add nodes based on zigzag order
                if (leftToRight) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val); // Add to the front of the list if right to left
                }

                // Enqueue child nodes for next level
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }

            // Toggle direction for the next level
            leftToRight = !leftToRight;
            result.add(list);
        }

        return result;
    }


    public static void main(String[] args) {
        // Sample tree: 
        //      3
        //     / \
        //    9   20
        //       /  \
        //      15   7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = zigzagLevelOrder(root);

        System.out.println("Zigzag Level Order Traversal:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}

