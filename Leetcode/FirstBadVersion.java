/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 *
 *
 * You are a product manager and currently leading a team to develop a new
 * product. Unfortunately, the latest version of your product fails the quality
 * check. Since each version is developed based on the previous version, all the
 * versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
 * bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version
 * is bad. Implement a function to find the first bad version. You should
 * minimize the number of calls to the API.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, bad = 4 Output: 4 Explanation: call isBadVersion(3) -> false
 * call isBadVersion(5) -> true call isBadVersion(4) -> true Then 4 is the first
 * bad version. Example 2:
 *
 * Input: n = 1, bad = 1 Output: 1
 *
 *
 */
public class FirstBadVersion {

    public static void main(String[] args) {

        int n = 5; // Number of versions
        System.out.println("The first bad version is: " + firstBadVersion(n)); 
    }

    public static int firstBadVersion(int n) {
        int left = 0;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;

            } else {
                left = mid + 1;
            }
        }

        if (left == right && isBadVersion(left)) {
            return left; // After the loop, left == right, and it points to the first bad version
        }
        return -1;
    }

    //Inbuilt implementation
    static boolean isBadVersion(int version) {
        // Dummy implementation, should be provided by the problem context
        // Here we assume version 4 and above are bad for illustration
        return version >= 4;
    }
}
