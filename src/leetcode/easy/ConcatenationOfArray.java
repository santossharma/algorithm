package leetcode.easy;

/*
1929. Concatenation of Array

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i]
and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]

https://leetcode.com/problems/concatenation-of-array/
*/
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1};

        int result[] = getConcatenation(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("");
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            result[i + nums.length] = result[i] = nums[i];
        }

        return result;
    }
}
