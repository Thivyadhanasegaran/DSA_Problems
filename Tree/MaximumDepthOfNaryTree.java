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
 *
 * Given a n-ary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root
 * node down to the farthest leaf node.
 *
 * Nary-Tree input serialization is represented in their level order traversal,
 * each group of children is separated by the null value (See examples).
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: root = [1,null,3,2,4,null,5,6] Output: 3 Example 2:
 *
 *
 *
 * Input: root =
 * [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * Output: 5
 *
 *
 *
 */
public class MaximumDepthOfNaryTree {

    public static void main(String[] args) {
        // Example tree:
        //       1
        //     / | \
        //    3  2  4
        //   / \
        //  5   6
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> childrenOf3 = new ArrayList<>();
        childrenOf3.add(node5);
        childrenOf3.add(node6);
        Node node3 = new Node(3, childrenOf3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        List<Node> childrenOf1 = new ArrayList<>();
        childrenOf1.add(node3);
        childrenOf1.add(node2);
        childrenOf1.add(node4);
        Node root = new Node(1, childrenOf1);

        int depth = maxDepth(root);
        System.out.println("The maximum depth of the tree is: " + depth); // Expected output: 3
    }

    static class Node {

        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<>();
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    // Actual Code 
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int maxDepth = 0;

        for (Node child : root.children) {
            maxDepth = Math.max(maxDepth, maxDepth(child));
        }

        return 1 + maxDepth;
    }
}
