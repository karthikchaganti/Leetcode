package com.stevesun.solutions;

/**
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

 Formally the function should:
 Return true if there exists i, j, k
 such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
 Your algorithm should run in O(n) time complexity and O(1) space complexity.

 Examples:
 Given [1, 2, 3, 4, 5],
 return true.

 Given [5, 4, 3, 2, 1],
 return false.
 */
public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        int small = nums[0], medium = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++){
            small = Math.min(small, nums[i-1]);
            if(nums[i] > small){
                medium = Math.min(medium, nums[i]);
                for(int j = i+1; j < nums.length; j++){
                    if(nums[j] > nums[i] || nums[j] > medium) return true;
                }
            }
        }
        return false;
    }

}
