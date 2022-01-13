package leetcode.easy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* 1431. Kids With the Greatest Number of Candies

There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]

 https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * */
public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] nums = new int[] {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> results = kidsWithCandies(nums, extraCandies);
        results.forEach(res -> System.out.print(res + " "));

        System.out.println("");
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>();
        int currentMax = -1;

        // Pick the maximum of the array, then loop again with subtracting extraCandies
        for (int i = 0; i < candies.length; i++) {
            currentMax = Math.max(candies[i], currentMax);
        }
        System.out.println("currentMax - " + currentMax);
        for (int i : candies) {
            results.add(i >= currentMax - extraCandies);
        }


        double d1 = 0.1;
        for (int i = 1; i <= 8; i++) {
            d1 += 0.1;
        }

        double d2 = 0.1 * 8;
        BigDecimal dd1 = BigDecimal.valueOf(d1);
        BigDecimal dd2 = BigDecimal.valueOf(d2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 == d2);
        System.out.println("Bigdecimal " + dd1);
        System.out.println("Bigdecimal " + dd2);
        System.out.println(dd1.equals(dd2));

        double value1 = 0.1d;
        value1 += 1;
        double value2 = 0.1d;

        double valueSum = value1 + value2;
        value2 += 1;
        System.out.println("Value 1 - "+ value1 + " value 2 - " + value2);
        System.out.println(value1==value2);
        System.out.println("valueSum - "  + valueSum);

        return results;
    }
}
