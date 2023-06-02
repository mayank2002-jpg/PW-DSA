package Dsa.SearchingAndSorting;

import java.util.Arrays;

//TC - O(n^2)
//SC - O(1)
public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            // for every iteration, we get the biggest element in an array in the end
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap between arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {23, 21, 54, 28, 77, 38, 53, 85, 32};
        //Function Calling
        bubbleSort(arr);
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
