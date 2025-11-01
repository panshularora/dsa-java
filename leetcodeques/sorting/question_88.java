package sorting;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
public class question_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        for(int i=0; i<m; i++){
            result[i] = nums1[i];
        }
        for(int j=0; j<n;j++){
            result[m+j] = nums2[j];
        }
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
    }
}
