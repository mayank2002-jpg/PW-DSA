package Dsa.SearchingAndSorting;
//TC - O(logN)
//SC - O(1)

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements Present in an Array");
        int n = sc.nextInt();

        System.out.println("Enter the array elements");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element");
        int x = sc.nextInt();

        int result = binarySearch(arr, x);
        if (result == 0) {
            System.out.println("Enter targeted value not found in array");
        } else {
            System.out.println("Enter targeted value found at location " + result);
        }
    }
}
