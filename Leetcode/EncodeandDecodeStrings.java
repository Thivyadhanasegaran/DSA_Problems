/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

Machine 1 (sender) has the function:

string encode(vector<string> strs) {
  // ... your code
  return encoded_string;
}
Machine 2 (receiver) has the function:
vector<string> decode(string s) {
  //... your code
  return strs;
}
So Machine 1 does:

string encoded_string = encode(strs);
and Machine 2 does:

vector<string> strs2 = decode(encoded_string);
strs2 in Machine 2 should be the same as strs in Machine 1.

Implement the encode and decode methods.

You are not allowed to solve the problem using any serialize methods (such as eval).

 

Example 1:

Input: dummy_input = ["Hello","World"]
Output: ["Hello","World"]
Explanation:
Machine 1:
Codec encoder = new Codec();
String msg = encoder.encode(strs);
Machine 1 ---msg---> Machine 2

Machine 2:
Codec decoder = new Codec();
String[] strs = decoder.decode(msg);
Example 2:

Input: dummy_input = [""]
Output: [""]
* 

 */
public class EncodeandDecodeStrings {
    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        StringBuilder strNew = new StringBuilder();

        for (String str : strs) {
            strNew.append(str.length()).append("#").append(str);
        }

        return strNew.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;
            // Find the '#' that separates the length and the actual string
            while (s.charAt(j) != '#') {
                j++;
            }

            // Extract the length of the string
            int length = Integer.parseInt(s.substring(i, j));

            // Extract the actual string using the length
            i = j + 1 + length;
            list.add(s.substring(j + 1, i));
        }

        return list;
    }

    // Main method to test encode and decode
    public static void main(String[] args) {
        
        // Example list of strings to encode
        List<String> inputStrings = new ArrayList<>();
        inputStrings.add("Hello");
        inputStrings.add("World");
        inputStrings.add("CodecTest");

        // Encode the list of strings
        String encodedString = encode(inputStrings);
        System.out.println("Encoded string: " + encodedString);

        // Decode the string back to a list of strings
        List<String> decodedStrings = decode(encodedString);
        System.out.println("Decoded strings: " + decodedStrings);
    }
}
