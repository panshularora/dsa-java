package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



// https://leetcode.com/problems/third-maximum-number/
// we can do this by to approach this is the sorting one
public class question_414 {
     public int thirdMax(int[] nums) {
        List<Integer> distinct = Arrays.stream(nums)   // convert array to stream
                                       .boxed()       // convert int → Integer
                                       .distinct()    // remove duplicates
                                       .sorted(Collections.reverseOrder()) // sort descending
                                       .collect(Collectors.toList());     // collect as List

        // return third max if exists, else return max
        return distinct.size() >= 3 ? distinct.get(2) : distinct.get(0);
    }
}


// lets solve this by other approach
// class Solution {
//     public int thirdMax(int[] nums) {
//         Long max1 = null, max2 = null, max3 = null;

//         for (Long n : Arrays.stream(nums).mapToObj(Long::valueOf).toArray(Long[]::new)) {
//             if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue; 

//             if (max1 == null || n > max1) {
//                 max3 = max2;
//                 max2 = max1;
//                 max1 = n;
//             } else if (max2 == null || n > max2) {
//                 max3 = max2;
//                 max2 = n;
//             } else if (max3 == null || n > max3) {
//                 max3 = n;
//             }
//         }

//         return max3 != null ? max3.intValue() : max1.intValue();
//     }
// }
