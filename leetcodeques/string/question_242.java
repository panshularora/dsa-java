package string;

//https://leetcode.com/problems/valid-anagram/description/


public class question_242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }   char[] nums1 = s.toCharArray();
            char[] nums2 = t.toCharArray();

            int[] countS = new int[26]; // since it is from a to z we are making the new array with 26 elements
            int[] countT = new int[26];

            for(int i=0; i<nums1.length; i++){
                countS[nums1[i] - 'a']++; // here we are subtracting it from 'a' so that for the indexing              
                countT[nums2[i] - 'a']++; // like a is zero indexed according to the count array
            }
            for(int i=0; i<26; i++){
                if(countS[i] != countT[i]){
                    return false;
                }
            }
        return true;
    }
}



// we could have used HashMap here also same thing but space complexity differs in the arrays and hashmap we see better space complexity in arrays
// cus arrays cannot be added or changed but Hash Map can
// but if we see uppercase or unique elements we have to use HashMap