package Dsa.Arrays;

import java.util.Scanner;

//TC - O(logN)
//SC - O(1)
public class SquareRoot {

    public static int findSquareRoot(int num) {
        int low = 0, high = num, result = -1;
        //Modified binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = mid * mid;

            if (val == num) {
                //Perfect square root
                return mid;
            } else if (val < num) {
                // store the floor value, incase the number is not perfect square root, we can print the floor value
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want square root of: ");
        int num = sc.nextInt();

        int result = findSquareRoot(num);
        System.out.println("Square root of given number is: " + result);
    }
}
