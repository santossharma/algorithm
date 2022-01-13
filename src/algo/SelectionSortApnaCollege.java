package algo;

// https://www.youtube.com/watch?v=PkJIc5tBRUE
public class SelectionSortApnaCollege {
    public static void main(String[] args) {
        int [] array = new int[] {7, 8, 2, 1, 3};

        // time complexity - O(n^2)
        for (int i = 0; i < array.length-1; i++) {
            int smallestIndex = i;

            for (int j = i+1; j < array.length; j++) {
                if(array[smallestIndex] > array[j]) {
                    smallestIndex = j;
                }
            }

            int tmp = array[smallestIndex]; // 1
            array[smallestIndex] = array[i];
            array[i] = tmp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
