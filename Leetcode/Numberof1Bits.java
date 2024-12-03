/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Write a function that takes the binary representation of a positive integer and returns the number of 
set bits
 it has (also known as the Hamming weight).

 

Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

Example 3:

Input: n = 2147483645

Output: 30

Explanation:

The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

 

Constraints:

1 <= n <= 231 - 1
* 
 */

/*1. An Integer is represented in 32-bit binary number.

2. 1 is represented as 0000000000000000000000000000000001 in binary.

3. Bitwise AND (&) of two numbers give 1 only when both digits are 1.
    0 & 0 = 0
    0 & 1 = 0 
    1 & 0 = 0
    1 & 1 = 1

4. RightShift operator >> is used to shift the binary digits right.

5. num >> 1 means binary digits of num are shifted right by 1 place.

*/
public class Numberof1Bits {
    // Function to count the number of '1' bits in an integer (Hamming Weight)
    public static int hammingWeight(int n) {
        int count = 0;
        
        // Iterate through each of the 32 bits of the integer
        for (int i = 0; i < 32; i++) {
            // Check if the last bit is 1
            if ((n & 1) == 1) {
                count++;
            }
            // Shift right to check the next bit
            n = n >> 1;
        }

        return count;
    }

    // Main method to test the hammingWeight function
    public static void main(String[] args) {
        
        // Test case 1
        int n1 = 11;  // Binary: 00000000000000000000000000001011
        System.out.println("Number of '1' bits in " + n1 + ": " + hammingWeight(n1)); // Output: 3
        
        // Test case 2
        int n2 = 128;  // Binary: 00000000000000000000000010000000
        System.out.println("Number of '1' bits in " + n2 + ": " + hammingWeight(n2)); // Output: 1

        // Test case 3
        int n3 = -3;  // Binary (two's complement): 11111111111111111111111111111101
        System.out.println("Number of '1' bits in " + n3 + ": " + hammingWeight(n3)); // Output: 31
    }
}
