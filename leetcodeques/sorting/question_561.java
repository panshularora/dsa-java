package sorting;
// https://leetcode.com/problems/array-partition/description/
import java.util.Arrays;

public class question_561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length/2;
        for(int i=0; i<nums.length; i+=2){
            sum = sum + nums[i];
        }
        return sum;
    }
}
