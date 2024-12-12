/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author thivya
 */
public class ZeroSumPairs {

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // HashSet to store individual numbers
        HashSet<Integer> set = new HashSet<>();
        // HashSet to store unique pairs
        HashSet<List<Integer>> setResult = new HashSet<>();

        // Add elements to the set
        for (int num : arr) {
            set.add(num);
        }

        // Iterate through the array and find pairs
        for (int num : arr) {
            int complement = 0 - num; // Find the complement that would sum to zero

            // Check if the complement exists and num != complement
            if (set.contains(complement)) {
                // Create a new list for the pair
                ArrayList<Integer> pair = new ArrayList<>();
                
                // Add the smaller value first to avoid duplicates like [-1, 1] and [1, -1]
                pair.add(Math.min(num, complement));
                pair.add(Math.max(num, complement));
                
                // Add the pair to setResult to avoid duplicates
                setResult.add(pair);
            }
        }

        // Convert the set of unique pairs to a list
        List<List<Integer>> result = new ArrayList<>(setResult);
        
        // Sort the result list
        result.sort((a, b) -> {
            if (a.get(0).equals(b.get(0))) {
                return a.get(1).compareTo(b.get(1));
            }
            return a.get(0).compareTo(b.get(0));
        });
        
        // Convert result to ArrayList<ArrayList<Integer>>
        ArrayList<ArrayList<Integer>> finalResult = new ArrayList<>();
        for (List<Integer> pair : result) {
            finalResult.add(new ArrayList<>(pair));
        }
        
        // Return the sorted list of unique pairs
        return finalResult;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {3, -1, 2, -3, 1, -2, 4, -4, 0};

        // Get pairs that sum to zero
        ArrayList<ArrayList<Integer>> pairs = getPairs(arr);

        // Print the result
        System.out.println("Unique pairs that sum to zero:");
        for (ArrayList<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
}
