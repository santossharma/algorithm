package algo;

// https://docs.google.com/document/d/1ZjI-1uDeUJgCj0Uz60wGOz2wHd163JjWNUmgby0wn-I/edit
public class InsertionSort {
    public static void main(String[] args) {
        // it has 2 parts - sorted part and un-sorted part
        // we can pick 1st element and consider it as sorted part
        // next we need to select unsorted element and place into sorted part

        // sorted part - arr[0] = 7
        // un-sorted part - arr[1]..arr[length-1] = {8,1,3,2}

        int arr[] = {7, 8, 1, 3, 2};

        //insertion sort
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                //Keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
