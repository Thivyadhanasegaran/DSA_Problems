/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */
public class ReverseVowelsofaString {
    public static void main(String[] args) {
        // Hardcoded string input
        String input = "hello";

        String result = reverseVowels(input);
        
        // Output the result
        System.out.println("String after reversing vowels: " + result);
    }


    public static String reverseVowels(String s) {
        // Convert the string into a character array
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // Two-pointer approach
        while (left < right) {
            // Move left pointer until a vowel is found
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            // Move right pointer until a vowel is found
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        // Convert the character array back to a string
        return new String(chars);
        
        
        // Using Stack 
        /*
        //         Stack<Character> stack = new Stack<>();

//         for(int i=0;i<s.length();i++){
//             char input = s.charAt(i);

//             if(input=='a' || input=='e' ||input=='i' ||
//             input=='u' ||  input=='o' || input=='A' ||input=='E' ||
//             input=='I' || input=='O' || input=='U')
//             {
// stack.push(input);
//             }
//         }
// StringBuilder str = new StringBuilder();
//        for(int i=0;i<s.length();i++){
//             char input = s.charAt(i);

//             if(input=='a' || input=='e' ||input=='i' ||
//             input=='u' ||  input=='o' || input=='A' ||input=='E' ||
//             input=='I' || input=='O' || input=='U')
//             {
//                 char value = stack.pop();
// str.append(value);

//             }else
//             str.append(input);
            
//         }
//         return str.toString();
        */
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char input) {
        return input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' ||
               input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U';
    }
}
