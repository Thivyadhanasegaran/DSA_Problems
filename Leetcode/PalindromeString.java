/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 */
public class PalindromeString {

    public static void main(String[] args) {
        // Example string.
        String s = "madam";
        System.out.println(palindrome(s));
    }

    static boolean palindrome( String s) {
        
        int index=0;
    
        for(int i = s.length()-1; i>=s.length()/2;i--){
            if(s.charAt(i)==s.charAt(index))
                index++;
            else
                return false;
        }
        return true;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Base Condition
        // If i exceeds half of the string, means all the elements 
        // are compared, we return true.
//        if (i >= s.length() / 2) {
//            return true;
//        }
//
//        // If start is not equal to end, not palindrome.
//        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
//            return false;
//        }
//
//        // If both characters are same, increment i and check start+1 and end-1.
//        return palindrome(i + 1, s);

    }

}

/*Time Complexity: O(N) { Precisely, O(N/2) as we compare the elements 
N/2 times and swap them}.

Space Complexity: O(1) { The elements of the given array are swapped 
in place so no extra space is required}.

*/
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

