/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author thivya
 * 
 * Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.

Example 1:

Input:
N = 3, M = 4
Mat[] = {{0 1 1 1},
         {0 0 1 1},
         {0 0 1 1}}
Output: 0
Explanation: Row 0 has 3 ones whereas
rows 1 and 2 have just 2 ones.

Example 2:

Input: 
N = 2, M = 2
Mat[] = {{0 1},
         {1 1}}
Output: 1
Explanation: Row 1 has 2 ones whereas
row 0 has just a single one. 
* 

 */
public class Maximumnoof1srow {
    public static int maxOnes(int Mat[][], int N, int M) {
        int maxCount = 0;
        int element = -1;

        for (int i = 0; i < N; i++) {
            int count = 0;
            int low = 0;
            int high = M - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (Mat[i][mid] == 1) {
                    count = M - mid;  // Count of 1's in the current row
                    high = mid - 1;   // Move left to find the first 1 in the row
                } else {
                    low = mid + 1;    // Move right to search for 1's
                }
            }

            // Update maxCount and row index if this row has more 1's
            if (count > maxCount) {
                maxCount = count;
                element = i;
            }
        }

        return element;
        
        
        
     /*Brute force method*/   
    //     int maxCount =0 ;
    //     int element = -1;
    //   for(int i=0;i<N;i++){
    //       int count = 0;
    //       for(int j=0;j<M;j++){
    //           if(Mat[i][j]==1){
    //               count++;
    //           }
    //       }
           
    //       if(count>maxCount){
    //           maxCount = count;
    //           element = i;
    //       }
           
    //   }
       
    //   return element;
    }

    public static void main(String[] args) {
        int[][] Mat = {
            {0, 0, 1, 1},
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 1}
        };
        
        int N = Mat.length;      // Number of rows
        int M = Mat[0].length;    // Number of columns

        int rowWithMaxOnes = maxOnes(Mat, N, M);
        System.out.println("Row with the maximum number of 1's is: " + rowWithMaxOnes);
    }
}
