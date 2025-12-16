package sorting;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/description/


public class question_217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i+1<nums.length && nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}







// THIS SOLUTION WILL GIVE A TLE (BRUTE FORCE USING ARRAYS)

// public boolean containsDuplicate(int[] nums) {
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j] ){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }



// the above expressions gave me o(n logn) complexity cus sorting is n logn 
// we can do it better by using HashSet
// basically they store unique values and no duplicates are allowerd order is also not gauraanted but is super fast
// import java.util.HashSet;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();

//         for (int num : nums) {
//             if (set.contains(num)) {
//                 return true;
//             }
//             set.add(num);
//         }
//         return false;
//     }
// }
