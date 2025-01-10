/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.

 

Example 1:

Input: n = 10, pick = 6
Output: 6
Example 2:

Input: n = 1, pick = 1
Output: 1
Example 3:

Input: n = 2, pick = 1
Output: 1
* 

 */

    // Mock GuessGame class to simulate the guess API
//static class GuessGame {
//    private static int pickedNumber; // Number to be guessed
//
//    public GuessGame(int pickedNumber) {
//        this.pickedNumber = pickedNumber;
//    }
//
//    /**
//     * API that compares the guessed number with the picked number.
//     * @param num Your guessed number
//     * @return -1 if num is higher than the picked number
//     *          1 if num is lower than the picked number
//     *          0 if num is equal to the picked number
//     */
//    public static int guess(int num) {
//        if (num > pickedNumber) {
//            return -1; // Guess is too high
//        } else if (num < pickedNumber) {
//            return 1; // Guess is too low
//        } else {
//            return 0; // Correct guess
//        }
//    }
//}
//
//// Solution class extending GuessGame
//public class Solution extends GuessGame {
//    public Solution(int pickedNumber) {
//        super(pickedNumber);
//    }
//
//    /**
//     * Find the picked number using Binary Search
//     * @param n Upper limit of the guessing range
//     * @return The guessed number
//     */
//    
//    
//    //Actual Code
//    public static int guessNumber(int n) {
//        int left = 1;
//        int right = n;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2; // Prevent overflow
//
//            int output = guess(mid);
//
//            if (output == -1) {
//                right = mid ; // Guess is too high
//            } else if (output == 1) {
//                left = mid + 1; // Guess is too low
//            } else {
//                return mid; // Correct guess
//            }
//        }
//
//        return -1; // Number not found (should not happen)
//    }
//
//    public static void main(String[] args) {
//        // Example test cases
//        int pickedNumber = 10; // Change this number to test
//        int n = 20; // Range from 1 to 20
//
//     
//        int guessedNumber = guessNumber(n);
//
//        System.out.println("Picked Number: " + pickedNumber);
//        System.out.println("Guessed Number: " + guessedNumber);
//
//        if (pickedNumber == guessedNumber) {
//            System.out.println("Success! The guessed number is correct.");
//        } else {
//            System.out.println("Failure! The guessed number is incorrect.");
//        }
//    }
    
    
    // Base GuessGame class
class GuessGame {
    protected static int pickedNumber; // Number to be guessed

    public GuessGame(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    /**
     * API that compares the guessed number with the picked number.
     * @param num Your guessed number
     * @return -1 if num is higher than the picked number
     *          1 if num is lower than the picked number
     *          0 if num is equal to the picked number
     */
    public static int guess(int num) {
        if (num > pickedNumber) {
            return -1; // Guess is too high
        } else if (num < pickedNumber) {
            return 1; // Guess is too low
        } else {
            return 0; // Correct guess
        }
    }
}

// Solution class that extends GuessGame
public class GuessNumberHigherOrLower extends GuessGame {

    public GuessNumberHigherOrLower(int pickedNumber) {
        super(pickedNumber);
    }

    /**
     * Find the picked number using Binary Search
     * @param n Upper limit of the guessing range
     * @return The guessed number
     */
    
    //Actual code
    public static int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent overflow

            int output = guess(mid);

            if (output == -1) {
                right = mid; // Guess is too high
            } else if (output == 1) {
                left = mid + 1; // Guess is too low
            } else {
                return mid; // Correct guess
            }
        }

        return -1; // Number not found (should not happen)
    }

    public static void main(String[] args) {
        // Test case
        int pickedNumber = 6; // Change this number to test
        int n = 10; // Range from 1 to 10

       // GuessNumberHigherOrLower game = new GuessNumberHigherOrLower(pickedNumber);
        int guessedNumber = guessNumber(n);

        System.out.println("Picked Number: " + pickedNumber);
        System.out.println("Guessed Number: " + guessedNumber);

        if (pickedNumber == guessedNumber) {
            System.out.println("Success! The guessed number is correct.");
        } else {
            System.out.println("Failure! The guessed number is incorrect.");
        }
    }
}
