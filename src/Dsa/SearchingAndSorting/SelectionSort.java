package Dsa.SearchingAndSorting;

import java.util.Arrays;

//TC - O(n^2)
//SC - O(1)
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //min_idx is taking the index of minimum element at every location
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                //Swap between arr[min_idx] and arr[i]
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {43, 52, 13, 642, 134, 86, 2365, 9, 5432, 862};
        selectionSort(arr);
        System.out.println("Sorted array is ");
        System.out.println(Arrays.toString(arr));
    }
}
