/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

/**
 *
 * @author thivya
 * 
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
* 
* 
* 
 */
public class BestTimeToBuyAndSellStockDP {
    public static void main(String[] args) {
       
        int[] prices = {7, 1, 5, 3, 6, 4};
        
        // Call the maxProfit method and print the result
        int result = maxProfit(prices);
        System.out.println("Maximum profit: " + result); // Output: Maximum profit: 5
        
        // Another test data
        int[] prices2 = {7, 6, 4, 3, 1};
        
        // Call the maxProfit method and print the result
        int result2 = maxProfit(prices2);
        System.out.println("Maximum profit: " + result2); // Output: Maximum profit: 0
    }
    
    
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            int cost = prices[i] - minPrice;

             maxProfit = Math.max(maxProfit,cost);
             minPrice = Math.min(minPrice, prices[i]);


        }
        return maxProfit;
    }
}
