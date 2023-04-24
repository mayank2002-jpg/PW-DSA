package Dsa.Arrays;

//TC - O(n)
//SC - O(1)
public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int n = arr.length;
        int flag = 0;

        for(int i = 0; i<n; i++){
            if(arr[i]!=arr[n-i-1]){
                flag = 1;
                System.out.println("Not a Palidromic Array");
                break;
            }
        }
        if(flag==0){
            System.out.println("Palidromic array");
        }
    }
}
