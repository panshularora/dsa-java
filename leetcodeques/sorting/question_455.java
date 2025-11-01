package sorting;

import java.util.Arrays;
// https://leetcode.com/problems/assign-cookies/description/


public class question_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(s[j] >= g[i]){
                i++;
                j++;
            } else{
                j++;
            }
        }
        return i;
    }
}
