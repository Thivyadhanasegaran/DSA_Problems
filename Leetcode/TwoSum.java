/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetCode;

import java.util.HashMap;

/**
 *
 * @author thivya Two Sum : Check if a pair with given sum exists in Array
 *
 * Problem Statement: Given an array of integers arr[] and an integer target.
 * Example 1: Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14 Result: YES
 * (for 1st variant) [1, 3] (for 2nd variant) Explanation: arr[1] + arr[3] = 14.
 * So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.
 *
 * Example 2: Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15 Result: NO
 * (for 1st variant) [-1, -1] (for 2nd variant) Explanation: There exist no such
 * two numbers whose sum is equal to the target.
 *
 */
public class TwoSum {

    public static int[] twoSum(int n, int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            mpp.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("This is the answer: [" + ans[0] + ", "
                + ans[1] + "]");

    }
}

/*
Output: This is the answer for variant 2: [1, 3]

Time Complexity: O(N), where N = size of the array.
Reason: The loop runs N times in the worst case and searching in 
a hashmap takes O(1) generally. So the time complexity is O(N).

Note: In the worst case(which rarely happens), the unordered_map
takes O(N) to find an element. In that case, the time complexity
will be O(N2). If we use map instead of unordered_map, the time 
complexity will be O(N* logN) as the map data structure takes logN
time to find an element.

Space Complexity: O(N) as we use the map data structure.

Note: We have optimized this problem enough. But if in the 
interview, we are not allowed to use the map data structure,
then we should move on to the following approach i.e. two pointer
approach. This approach will have the same time complexity as the better approach.
 */
