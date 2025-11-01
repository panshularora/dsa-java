package sorting;

import java.util.ArrayList;
import java.util.List;

public class question_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctindex = nums[i] -1;
            if(nums[i] != nums[correctindex]){
                int temp = nums[i];
                nums[i] = nums[correctindex];
                nums[correctindex] = temp;
            } else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
