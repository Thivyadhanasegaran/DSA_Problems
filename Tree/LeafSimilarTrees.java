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
 * Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.



For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

 

Example 1:


Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true
Example 2:


Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false
* 
* Reference: Video for concept: https://www.youtube.com/watch?v=Nr8dbnL0_cM
* code: https://leetcode.com/problems/leaf-similar-trees/solutions/4531582/beats-100-depth-first-search-explained-with-video-c-java-python-js/?envType=study-plan-v2&envId=leetcode-75
 */
public class LeafSimilarTrees {
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


    // Actual code
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Collect leaf values for both trees
        findLeafSimilarFunction(list1, root1);
        findLeafSimilarFunction(list2, root2);

       if(list1.equals(list2)){
            return true;
         }else
         return false;

    }

    public static void findLeafSimilarFunction(List<Integer> list, TreeNode root) {
        if (root == null)
            return;

        // If it's a leaf node, add the value to the list
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        } else {
            // Recursively traverse left and right subtrees
            findLeafSimilarFunction(list, root.left);
            findLeafSimilarFunction(list, root.right);
        }
    }
  // till here
    
    public static void main(String[] args) {
        // Test case 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        root1.right.right = new TreeNode(8);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.left.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(8);


        boolean result = leafSimilar(root1, root2);
        System.out.println(result); // Output: false (because the leaf nodes are [6, 7, 4, 8] and [6, 4, 8 ]for both trees)
    }
    }
}
