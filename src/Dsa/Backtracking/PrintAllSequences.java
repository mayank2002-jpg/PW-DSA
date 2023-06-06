package Dsa.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintAllSequences {

    public static void printSequence(int[] arr, int index, ArrayList<Integer> tempArr) {
        if (index == arr.length) {
            if (tempArr.size() > 0) {
                System.out.println(tempArr);
            }
            return;
        }
        //recursive call
        //include
        printSequence(arr, index + 1, tempArr);
        tempArr.add(arr[index]);

        //do not include
        printSequence(arr, index + 1, tempArr);
        tempArr.remove(tempArr.size() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the array element: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("For the array - " + Arrays.toString(arr));
        printSequence(arr, 0, new ArrayList<Integer>());
    }
}
