package array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

// https://www.linkedin.com/sharing/share-offsite/?url=https%3A%2F%2Fleetcode.com%2Fproblems%2Ftwo-sum%2Fsubmissions%2F

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 5, 7, 5, 10};

        int[] result = twoSum(nums, 9);

        for (int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
    }

    private static int[] twoSum(int[] nums, int target) {

        int[] result = new int[0];

        // brute force solution
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result = new int[]{i, j};
                }
            }
        }*/

        //return result;

        Map<Integer, Integer> visitedNumMap = new HashMap<>(); // value, index

        for (int i=0; i<nums.length; i++) {
            //System.out.println(indexVal);
            int delta = target - nums[i];
            //System.out.println(delta);

            if(visitedNumMap.containsKey(delta)) {
                // System.out.println("value found "+ delta);
                //return new int[] {i, visitedNumMap.get(delta)};
                return new int[] {visitedNumMap.get(delta), i};
            }
            //System.out.println("value " + nums[i]);
            visitedNumMap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
