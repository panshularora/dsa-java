package string;

//https://leetcode.com/problems/longest-common-prefix/

public class question_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String first = strs[0];

        // fix character position
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);

            // compare across all strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}


// this question kinda tough 
// basic logic is character is kept constant and we search strings
