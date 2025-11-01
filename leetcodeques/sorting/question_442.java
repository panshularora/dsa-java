package sorting;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class question_442 {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                result.add(nums[i]);
            }
        }
        return result;
    }
}
