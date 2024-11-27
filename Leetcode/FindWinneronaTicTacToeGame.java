/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid. The rules of Tic-Tac-Toe are:

Players take turns placing characters into empty squares ' '.
The first player A always places 'X' characters, while the second player B always places 'O' characters.
'X' and 'O' characters are always placed into empty squares, never on filled ones.
The game ends when there are three of the same (non-empty) character filling any row, column, or diagonal.
The game also ends if all squares are non-empty.
No more moves can be played if the game is over.
Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that the ith move will be played on grid[rowi][coli]. return the winner of the game if it exists (A or B). In case the game ends in a draw return "Draw". If there are still movements to play return "Pending".

You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe), the grid is initially empty, and A will play first.

 

Example 1:


Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
Output: "A"
Explanation: A wins, they always play first.
Example 2:


Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
Output: "B"
Explanation: B wins.
Example 3:


Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
Output: "Draw"
Explanation: The game ends in a draw since there are no moves to make.
 

Constraints:

1 <= moves.length <= 9
moves[i].length == 2
0 <= rowi, coli <= 2
There are no repeated elements on moves.
moves follow the rules of tic tac toe.
* 
* 
 */
public class FindWinneronaTicTacToeGame {
    public static String tictactoe(int[][] moves) {
        int n = moves.length;
        char[][] board = new char[3][3];

        // Populate the board based on the moves
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                board[moves[i][0]][moves[i][1]] = 'X'; // Player A
            } else {
                board[moves[i][0]][moves[i][1]] = 'O'; // Player B
            }
        }

        // Check the board for a winner or draw
        return checkBoard(board);
    }

    // Method to check the board for a winner or draw
    public static String checkBoard(char[][] board) {
        // Check rows and columns for a win
        for (int j = 0; j < 3; j++) {
            int countA = 0;
            int countB = 0;
            for (int i = 0; i < 3; i++) {
                if (board[j][i] == 'X') countA++;
                else if (board[j][i] == 'O') countB++;

                if (board[i][j] == 'X') countA++;
                else if (board[i][j] == 'O') countB++;
            }
            if (countA == 3) return "A";
            if (countB == 3) return "B";
        }

        // Check diagonals for a win
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') return "A";
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') return "B";

        if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') return "A";
        if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') return "B";

        // Check if there are still empty spots left
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X' || board[i][j] == 'O') c++;
            }
        }

        // Return "Pending" if the game is not yet finished
        if (c != 9) return "Pending";

        // Return "Draw" if the board is full with no winner
        return "Draw";
    }

    // Main method to run the code and test
    public static void main(String[] args) {
  
        // Example moves: Player A (X) and Player B (O)
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};

        // Output the result of the game
        String result = tictactoe(moves);
        System.out.println("Game Result: " + result); 
    }
}
