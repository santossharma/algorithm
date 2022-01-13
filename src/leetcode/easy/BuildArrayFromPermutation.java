package leetcode.easy;

/*
1920. Build Array from Permutation

Given a zero-based permutation nums (0-indexed), build an array ans of the same length where
ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]

Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]

https://leetcode.com/problems/build-array-from-permutation/
* */
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums1  = new int[] {0,2,1,5,3,4};
        int[] nums = new int[] {5,0,1,2,3,4};

        int[] ans = buildPermutatedArray(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    private static int[] buildPermutatedArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
