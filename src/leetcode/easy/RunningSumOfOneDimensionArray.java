package leetcode.easy;

/*
1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Input: nums = [1,2,3,4]
Output: [1,3,6,10]

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]

 */
public class RunningSumOfOneDimensionArray {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,4};
        int[] nums = new int[] {1,1,1,1,1};

        int[] ans = runningSum(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    private static int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) { // second loop till i
                result[i] += nums[j];
            }
        }
        return result;
    }
}
