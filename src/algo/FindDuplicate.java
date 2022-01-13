package algo;

import java.util.Arrays;

// Floyd's cycle algorithm (Floyd tortoise and here algorithm)
// https://www.youtube.com/watch?v=64oD9VmaS18
public class FindDuplicate {

    public static void main(String[] args) {
        int[] numbers = new int[] {2,1,4,7,3,1,5,6};

        int slowIndex = numbers[0];
        int fastIndex = numbers[0];

        do {
            slowIndex = numbers[slowIndex];
            fastIndex = numbers[numbers[fastIndex]];

            System.out.println("slowIndex " + slowIndex + " fastIndex " + fastIndex);
        } while (slowIndex != fastIndex);

        slowIndex = numbers[0];

        while (slowIndex != fastIndex) {
            slowIndex = numbers[slowIndex];
            fastIndex = numbers[fastIndex];
        }
        System.out.println("Duplicate Value : " + fastIndex);
    }
}
