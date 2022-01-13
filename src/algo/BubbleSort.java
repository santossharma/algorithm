package algo;

/* need to iterate through n-1 and find the biggest number and move it to the last
* Step 1 - Need 2 loop, second loop loops through array's lenght -1 and -first array's index (becz in outer loop
* its sorted already*/
// https://www.youtube.com/watch?v=PkJIc5tBRUE
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[] {7,100,8,3,1,2};

        // Time complexcity = O(n^2)
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                System.out.print(i + " - " +j);
                if(array[j] > array[j+1]) {
                    // swap
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
                System.out.println();
            }
        }

        print(array);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
