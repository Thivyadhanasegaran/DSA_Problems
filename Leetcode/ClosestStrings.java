/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author thivya
 * 
 * Given a list of words followed by two words, the task to find the minimum distance between the given two words in the list of words


Example 1:

Input:
S = { "the", "quick", "brown", "fox", 
     "quick"}
word1 = "the"
word2 = "fox"
Output: 3
Explanation: Minimum distance between the 
words "the" and "fox" is 3
Example 2:

Input:
S = {"geeks", "for", "geeks", "contribute", 
     "practice"}
word1 = "geeks"
word2 = "practice"
Output: 2
Explanation: Minimum distance between the
words "geeks" and "practice" is 2
* 
 */
public class ClosestStrings {
    // Method to find the shortest distance between two words in a list
    public static int shortestDistance(List<String> words, String word1, String word2) {
        int num1 = -1;
        int num2 = -1;
        int result = Integer.MAX_VALUE;
        
        // Loop through the list to find the positions of word1 and word2
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word1)) 
                num1 = i;
            if (words.get(i).equals(word2)) 
                num2 = i;
            
            // Calculate the distance if both words have been found
            if (num1 != -1 && num2 != -1) {
                int diff = Math.abs(num1 - num2);
                result = Math.min(result, diff);
            }
        }
        
        return result;
    }
    
    // Main method to test the shortestDistance function
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("the", "quick", "brown", "fox", "quick"));
        String word1 = "quick";
        String word2 = "fox";
        
        int distance = shortestDistance(words, word1, word2);
        System.out.println("The shortest distance between \"" + word1 + "\" and \"" + word2 + "\" is: " + distance);
    }
}
