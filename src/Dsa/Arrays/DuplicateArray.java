package Dsa.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,5,5};
        int n = arr.length;

        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate number found is: " + arr[i]);
                    break;
                }
            }
        }
    }
}
