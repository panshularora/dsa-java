package sorting;
// https://leetcode.com/problems/set-mismatch/description/

public class question_645 {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            } else{
                i++;
            }
        }
        for(i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i], i + 1};
            }
        }
        return new int[]{-1, -1};
    }
}
