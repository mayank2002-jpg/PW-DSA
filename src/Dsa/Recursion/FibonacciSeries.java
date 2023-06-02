package Dsa.Recursion;

import java.util.Scanner;

//TC - O(2^n) --> exponential time complexity
//SC - O(n)
public class FibonacciSeries {

    public static int fibonacciFinding(int n) {
        int result = 0;
        if (n <= 1) {
            return n;
        } else {
            result = fibonacciFinding(n - 1) + fibonacciFinding(n - 2);
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in fibonacci series: ");
        int n = sc.nextInt();
        //Function calling
        int result = fibonacciFinding(n);
        System.out.println("The final output is " + result);
    }
}
