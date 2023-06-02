package Dsa.SearchingAndSorting;

import java.util.Scanner;

//TC - O(logN)
//SC - O(1)
public class LowerBound {

    public static int firstOccurenceElement(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
//                Transverse to left of array
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements present in array");
        int n = sc.nextInt();

        System.out.println("Enter the numbers in array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter targeted element");
        int x = sc.nextInt();

//Function Calling
        int result = firstOccurenceElement(arr, x);
        if (result == -1) {
            System.out.println("Lower Bound doest not found in an array");
        } else {
            System.out.println("Lower Bound Present in an array " + result);
        }
    }
}
