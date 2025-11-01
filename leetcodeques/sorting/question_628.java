import java.util.Arrays;
// https://leetcode.com/problems/maximum-product-of-three-numbers/



public class question_628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mul1 = nums[n-3] * nums[n-1] * nums[n-2];
        int mul2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(mul1, mul2);
    }
}
