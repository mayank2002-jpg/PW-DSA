package Dsa.DivideandConquer;

import java.util.Arrays;

public class InversionCount {

    public static int inversionCount(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    //TC - O(n)
    //SC - O(n)
    public static int mergeProcedure(int[] arr, int l, int mid, int h) {
        int swap = 0;
        //left and right subarray
        int[] lsubarray = Arrays.copyOfRange(arr, l, mid + 1);
        int[] rsubarray = Arrays.copyOfRange(arr, mid + 1, h + 1);

        int i = 0, j = 0, k = l;

        while (i < lsubarray.length && j < rsubarray.length) {
            if (lsubarray[i] <= rsubarray[j]) {
                arr[k++] = lsubarray[i++];
            } else {
                arr[k++] = rsubarray[j++];
                //calculate the number of swaps
                swap += (mid + 1) - (l + i);
            }
        }
        //Copying of all remaining elements from left subarray
        while (i < lsubarray.length) {
            arr[k++] = lsubarray[i++];
        }
        //Copying all the elements from right subarray
        while (j < rsubarray.length) {
            arr[k++] = rsubarray[j++];
        }
        return swap;
    }


    public static int inversionCountDC(int[] arr, int l, int h) {
        int count = 0;
        if (l < h) {
            //1. Divide the array into subproblems
            int mid = l + (h - l) / 2;

            //2. Conquer the subproblems using the recursive approach
            //left subarray
            count += inversionCountDC(arr, l, mid);
            //right subarray
            count += inversionCountDC(arr, mid + 1, h);

            //3. Combine the solution
            count += mergeProcedure(arr, l, mid, h);

        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 8, 3, 4};
        int n = arr.length;

        int count = inversionCount(arr, n);
        int countOpt = inversionCountDC(arr, 0, n - 1);

        System.out.println("The inversion count of an array using brute force is: " + count);

        System.out.println("The inversion count of an array using optimized approach(Divide and conquer) is: " + countOpt);
    }
}
