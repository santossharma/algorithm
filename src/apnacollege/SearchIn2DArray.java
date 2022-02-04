package apnacollege;

import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int [][]numbers = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int numberToFind = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(numbers[i][j] == numberToFind) {
                    System.out.println(numberToFind + " found at indices ["+ i + ", " +j+"]");
                    break;
                }
            }
        }
    }
}
