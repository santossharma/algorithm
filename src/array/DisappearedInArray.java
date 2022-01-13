package array;

import java.util.ArrayList;
import java.util.List;

// LeetCode 448
// https://www.youtube.com/watch?v=re7fhVyKWZI
// https://www.youtube.com/watch?v=jSfDPVIYe1s&list=PLIIhpZMtp9m4dDvhHpXqqb3tPiWQygf8A&index=1

public class DisappearedInArray {
    public static void main(String[] args) {
        int[] nums = new int[] {3,3,1};

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println(result);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumList = new ArrayList<Integer>();
        // mark all number with -1 as visited
        for (int i = 0; i < nums.length; i++) {
            int current = Math.abs(nums[i]);

            nums[current-1] = -(Math.abs(nums[current-1]));
        }

        for (int i = 0; i < nums.length; i++) {
            // checks the indics
            if(nums[i] > 0) {
                missingNumList.add(i+1);
            }
        }
        return missingNumList;
    }

}
