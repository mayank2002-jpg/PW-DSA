package Dsa.Arrays;


//TC - O(n)
//SC - O(1)
public class ReversalOfArray {
    public static void main(String[] args) {
        int[] arr = {23,44,13,54,67,99};
        int n = arr.length;
        for(int i = 0; i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("Reversal of an Array is: ");
        for(int i = 0; i<n; i++ ){
            System.out.print(arr[i]+ " ");
        }
    }
}
