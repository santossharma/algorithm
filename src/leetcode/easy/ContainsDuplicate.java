package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Leetcode 219 - Contain Duplicates II */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,1};
        int k = 3;

        boolean result = containsNearByDuplicate(nums, k);

        System.out.println(result);
    }

    private static boolean containsNearByDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> indices = map.getOrDefault(nums[i], new ArrayList<>());

            for (int j : indices) {
                if(Math.abs(i-j) <= k) {
                    return true;
                }
            }
            indices.add(i);
            map.put(nums[i], indices);
        }

        return false;
    }


}
