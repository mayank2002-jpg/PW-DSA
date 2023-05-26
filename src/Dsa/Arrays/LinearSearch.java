package Dsa.Arrays;

import java.util.Scanner;

//Time complexity - O(n)
//Space Complexity - O(1)

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements present in an array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter targeted ELement:");
        int x = sc.nextInt();

        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("Searched element is not found in an array");
        } else {
            System.out.println("Searched element is found at the location " + idx);
        }
    }
}
