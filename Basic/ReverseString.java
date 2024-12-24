/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author thivya
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println(s1); 

    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1; //(s is character array so length property is used)

        while (start < end) {
            char temp = s[start]; //(s is character array so it is accessed using index)
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}

//Output:
//
//The reversed string is- OLLEH
//
//Time Complexity: O(N)
//
//Reason: The while loop will iterate n/2 time
//
//Space Complexity: O(1)
//
//Reason: We are not using any extra space.





// Using extra space
//        String a = "Hello";
//        String b = "";
//        char character;
//
//        System.out.print("Original word: ");
//        System.out.println(a); //Example word
//
//        for (int i = 0; i < a.length(); i++) {
//            character = a.charAt(i); //extracts each character
//            b = character + b; //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: " + b);
//    }

