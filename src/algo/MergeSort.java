package algo;

// https://www.youtube.com/watch?v=unxAnJBy12Q&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=28
// Time Complexity : O(nlogn)

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        //int[] array = new int[] {6, 3, 9, 5, 2, 8};
        int[] array = new int[] {3,2,1,4};

        divideInTwoParts(array);

        divide(array, 0, array.length-1);

        // print
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    private static void divideInTwoParts(int[] array) {
        int mid = array.length / 2;
        int startingIndex = mid+1;
        int[] firstPartArray = new int[array.length-mid];
        int[] secondPartArray = new int[array.length - firstPartArray.length];

        for (int i = 0; i < array.length; i++) {
            if (i < firstPartArray.length) {
                firstPartArray[i] = array[i];
            }
            else {
                secondPartArray[i - firstPartArray.length] = array[i];
            }
        }

        System.out.println(array);
    }

    public static void divide(int array[], int startingIndex, int endingIndex) {
        if(startingIndex >= endingIndex) {
            return;
        }

        int midIndex = startingIndex + (endingIndex-startingIndex)/2;
        System.out.println(Arrays.toString(array));

        System.out.println("midIndex - " +midIndex+ ", Mid Value [] - "+array[midIndex]+ ", endingIndex - " + endingIndex);
        divide(array, startingIndex, midIndex); // first part: {6, 3, 9}

        System.out.println();
        divide(array, midIndex+1, endingIndex); // second part: {5, 2, 8}

        conquer(array, startingIndex, midIndex, endingIndex);
    }

    private static void conquer(int[] array, int startingIndex, int middleIndex, int endingIndex) {
        // create a new array with same length
        int mergedArray[] = new int[endingIndex - startingIndex + 1];
        int firstPartsIndex = startingIndex;
        int secondPartsIndex = middleIndex+1;
        int mergedArrayIndex = 0;

        // {6, 3, 9} {5, 2, 8}

         while (firstPartsIndex <= middleIndex && secondPartsIndex <= endingIndex) {
             if(array[firstPartsIndex] <= array[secondPartsIndex]) {
                 mergedArray[mergedArrayIndex++] = array[firstPartsIndex++]; // increase the pointer
                 //mergedArrayIndex++; firstPartsIndex++;
             } else {
                 mergedArray[mergedArrayIndex++] = array[secondPartsIndex++]; // increase the pointer
             }
         }

         while (firstPartsIndex <= middleIndex) {
             mergedArray[mergedArrayIndex++] = array[firstPartsIndex++];
         }

         while (secondPartsIndex <= endingIndex) {
             mergedArray[mergedArrayIndex++] = array[secondPartsIndex++];
         }

         // copy into original array from mergedArray
        for (int i = 0, j=startingIndex; i < mergedArray.length; i++, j++) {
            array[j] = mergedArray[i];
        }

    }
}
