package algo;

import java.util.ArrayList;
import java.util.List;

/* In SelectionSort, we need to find the smallest element in the array */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arrays = new int[] {4,1,9,2,3,6};
        List sortedList = selectionSort(arrays);
        System.out.println(sortedList);
    }

    private static List selectionSort(int[] arrays) {
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            int minimumIndex = i;

            for (int j = i+1; j <arrays.length ; j++) {
                if(arrays[j] < arrays[minimumIndex]) { // smallest finding
                    minimumIndex = j;
                }
            }
            int temp = arrays[minimumIndex];
            if(minimumIndex != i) { // if smallest value changes, need to swap the new smallest
                // swap (array, min, i)
                swap(arrays, minimumIndex, i);
                /*arrays[minimumIndex] = arrays[i];
                arrays[i] = temp;*/

            }
            sortedList.add(temp);
        }
        return sortedList;
    }
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
