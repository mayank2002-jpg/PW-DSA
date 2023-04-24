package Dsa.Arrays;


//TC - O(n)
//SC - O(1)
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,5,6,9};
        int n = arr.length;
        int sumOfNaturalNumbers = ((n+1)*(n+2))/2;   //base formula is = n(n+1)/2 we have use m = n+1 here
        int sum = 0;
        for(int i = 0; i<n;i++){
            sum += arr[i];
        }
        int missingElement = 0;
        missingElement = sumOfNaturalNumbers-sum;
        System.out.println("The missing element is: " + missingElement);
    }
}
