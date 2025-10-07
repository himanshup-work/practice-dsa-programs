package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {25, 6, 8, 1, 16, 2, 55, 5, 77, 20};
        InsertionSort x = new InsertionSort();
        x.sort(arr);

    }
    public void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i <= n-1; i++){
            int j = i;
//            for (int j = i; j>0; j--){
//                if(arr[j] < arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
