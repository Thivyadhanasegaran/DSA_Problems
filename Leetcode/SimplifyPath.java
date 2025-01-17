/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.Stack;

/**
 *
 * @author thivya
 * 
 * You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:

A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
The simplified canonical path should follow these rules:

The path must start with a single slash '/'.
Directories within the path must be separated by exactly one slash '/'.
The path must not end with a slash '/', unless it is the root directory.
The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
Return the simplified canonical path.

 

Example 1:

Input: path = "/home/"

Output: "/home"

Explanation:

The trailing slash should be removed.

Example 2:

Input: path = "/home//foo/"

Output: "/home/foo"

Explanation:

Multiple consecutive slashes are replaced by a single one.

Example 3:

Input: path = "/home/user/Documents/../Pictures"

Output: "/home/user/Pictures"

Explanation:

A double period ".." refers to the directory up a level (the parent directory).

Example 4:

Input: path = "/../"

Output: "/"

Explanation:

Going one level up from the root directory is not possible.

Example 5:

Input: path = "/.../a/../b/c/../d/./"

Output: "/.../b/d"

Explanation:

"..." is a valid name for a directory in this problem.
* 
* Reference: Video (for concept only) https://www.youtube.com/watch?v=qYlHrAKJfyA
* For code: https://leetcode.com/problems/simplify-path/solutions/3407361/easy-solutions-in-java-python-and-c-look-at-once-with-exaplanation/?envType=study-plan-v2&envId=top-interview-150
 */
public class SimplifyPath {
     public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] input = path.split("/");

        for (String value : input) {
            if (value.equals(".") || value.isEmpty()) {
                continue;
            } else if (value.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(value);
            }
        }

        return "/" + String.join("/", st);
    }


    public static void main(String[] args) {
     

        // Test cases
        String path1 = "/home/";
        String path2 = "/../";
        String path3 = "/home//foo/";
        String path4 = "/a/./b/../../c/";

        // Printing results
        System.out.println("Simplified path for \"" + path1 + "\": " + simplifyPath(path1));
        System.out.println("Simplified path for \"" + path2 + "\": " + simplifyPath(path2));
        System.out.println("Simplified path for \"" + path3 + "\": " + simplifyPath(path3));
        System.out.println("Simplified path for \"" + path4 + "\": " + simplifyPath(path4));
    }
}
