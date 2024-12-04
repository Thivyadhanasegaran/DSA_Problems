/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 */
// How do you determine if a string is a palindrome?
//public class PalindromeNumber {
//
//    public static void main(String[] args) {
//        String a = "level";
//        boolean status = palindromeFunction(a);
//        if (status == true) {
//            System.out.println("Given string is a palindrome");
//        } else {
//            System.out.println("Given string is not a palindrome");
//        }
//    }
//
//    public static boolean palindromeFunction(String a) {
//        String reverse = "";
//        for (int i = 0; i < a.length(); i++) {
//            reverse = a.charAt(i) + reverse;
//        }
//        if (reverse.equals(a)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
// How do you determine if a number is a palindrome?
/*Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/
public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 121;
        boolean status = palindromeFunction(x);
        if (status == true) {
            System.out.println("Given number is a palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }
    }

    public static boolean palindromeFunction(int input) {
        int originalNumber = input;
        int reverseNumber = 0;

        if (originalNumber < 0) {
            return false;
        }
        while (input != 0) {
            int digit = input % 10;
            reverseNumber = reverseNumber * 10 + digit;
            input = input / 10;
        }
        return reverseNumber == originalNumber;
    }
}
/*
Time: O(logN)
Space: O(1)
 */


/*
Time Complexity:
The time complexity of the isPalindrome function is
O(n) where
n is the number of digits in the integer x.

* The while loop runs for each digit in the number x. In each iteration, 
we extract the last digit and build the reversed number.
* The number of iterations of the while loop is proportional to the number
of digits in x, which is O(log⁡10x)O(\log_{10} x)O(log10 x).
Since log⁡10x\log_{10} xlog10 x is directly related to
the number of digits in x, we can approximate the time complexity 
to O(n), where n is the number of digits.


Space Complexity:
The space complexity of the isPalindrome function is
O(1)

* The algorithm uses a constant amount of extra space 
(variables original, result, and check) that does not depend on the input size.
* There are no data structures (like arrays or lists) 
that grow with the size of the input, so the space complexity remains constant.
Summary:
* Time Complexity: O(n)O(n)O(n), where n is the 
number of digits in the integer x.
* Space Complexity: O(1), constant space usage.

*/