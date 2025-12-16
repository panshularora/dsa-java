//https://leetcode.com/problems/two-sum/description/

// the brute force solution for this is to use two for loops so that we see every value at every time 
// let optimize it using hashmap

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap< Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int temp = target - nums[i];

            if(map.containsKey(temp)){
                return new int[]{i, map.get(temp)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}