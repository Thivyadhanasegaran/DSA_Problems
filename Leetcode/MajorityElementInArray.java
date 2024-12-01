/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thivya
 */
public class MajorityElementInArray {

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 2, 2, 2, 2};
        int majElement = majorityElementFunction(arr);
        System.out.println("The majority element in the array is: " + majElement);
    }

    public static int majorityElementFunction(int[] arr) {
        
        
        //Optimal Solution using Moore's Voting Algorithm
        //Time complexity: O(N)
        //Space complexity: O(1)
        
        int majorityElement = arr[0];
        int vote =1;
        
        for(int i=1;i<arr.length;i++){
            
            if(vote==0){
                
                vote++;
                majorityElement = arr[i];
                
            }else if(majorityElement==arr[i]){
                vote++;
            }else
                vote--;
        }
        
        return majorityElement;
        
        
        //Time complexity: O(N*logN) + O(N)
        //Space complexity: O(N)
//        int length = arr.length;
//
//        Map<Integer, Integer> mp = new HashMap<>();
//
//        for (int i = 0; i < length; i++) {
//            int value = mp.getOrDefault(arr[i], 0);
//            mp.put(arr[i], value + 1);
//        }
//
//        for (int i : mp.keySet()) {
//            if (mp.get(i) > length / 2) {
//                return i;
//            }
//        }
//        return -1;

    }
}


/*Time Complexity: O(N*logN) + O(N), where N = size of the given array.
Reason: We are using a map data structure. Insertion in the map 
takes logN time. And we are doing it for N elements. So, it
results in the first term O(N*logN). The second O(N) is for
checking which element occurs more than floor(N/2) times. 
If we use unordered_map instead, the first term will be O(N) for 
the best and average case and for the worst case, it will be O(N2).

Space Complexity: O(N) as we are using a map data structure.
 */

