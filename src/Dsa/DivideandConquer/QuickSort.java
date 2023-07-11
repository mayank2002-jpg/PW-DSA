package Dsa.DivideandConquer;

public class QuickSort {

    public static int partition(int[] arr, int l, int h) {
        int i = l;
        //Pivot as the first element in array
        int pivot = arr[i];

        for (int j = l + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i++;
                //Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Swap(arr[l], arr[i])
        //To return the correct index of the pivot element
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;

        return i;
    }


    public static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            //1. Divide the array into subparts
            int m = partition(arr, l, h);
            //2. Conquer those subproblems via recursion
            quickSort(arr, l, m - 1);
            quickSort(arr, m + 1, h);
        }
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        int[] arr = {50, 20, 70, 90, 10, 13, 17, 21};
        int n = arr.length;
        System.out.println("Array before sorting is : ");
        printArr(arr, n);

        quickSort(arr, 0, n - 1);

        System.out.println("Array after sort is : ");
        printArr(arr, n);
    }
}
