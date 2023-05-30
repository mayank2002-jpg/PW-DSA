package Dsa.Arrays;

import java.util.Arrays;

//TC - O(n^2)
//SC - O(1)
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                //Swap the elements between arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {23, 21, 54, 28, 77, 38, 53, 85, 32};
        insertionSort(arr);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));

    }
}
