package Dsa.Recursion;

import java.util.Scanner;

public class FactorialOfNumber {

    public static int factorial(int n) {
        int result = 0;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is : " + result);
    }
}
