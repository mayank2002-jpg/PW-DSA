package Dsa.Recursion;

import java.util.Scanner;

//TC - O(logN)
public class CountWays {

    public static int countNum(int n) {
        int result = 0;
        if (n <= 1) {
            return n;
        } else {
            result = countNum(n - 1) + countNum(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n = sc.nextInt();
        int result = countNum(n + 1);
        System.out.println("The number of ways: " + result);
    }
}
