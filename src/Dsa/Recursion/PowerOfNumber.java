package Dsa.Recursion;

import java.math.BigInteger;
import java.util.Scanner;


public class PowerOfNumber {
    //Approach - 1 (Brute force)
//    public static int powerFinding(int a, int b) {
//        int result = 0;
//        if (b == 1) {
//            return a;
//        } else {
//            result = a * powerFinding(a, b - 1);
//        }
//        return result;
//    }


    //Approach - 2(Optimized Approach)
    public static BigInteger powerFinding2(BigInteger a, int b) {
        BigInteger result, finalResult;
        if (b == 1) {
            return a;
        } else {
            result = powerFinding2(a, b / 2);
            finalResult = result.multiply(result);

            if (b % 2 == 0) {
                return finalResult;
            } else {
                return a.multiply(finalResult);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose power to find: ");
        //int a = sc.nextInt();
        BigInteger a = sc.nextBigInteger();
        System.out.println("Enter the power: ");
        int b = sc.nextInt();


        //Approach-1
        //int result = powerFinding(a, b);
        //System.out.println("Final result: " + result);


        // Approach-2
        BigInteger finalResult = powerFinding2(a, b);
        System.out.println("Final result: " + finalResult);
    }
}