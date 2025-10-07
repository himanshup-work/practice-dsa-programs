package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,8,1,6,2,55,5,77,20};
        for (int i = 0; i <= arr.length-2; i++) {
            int min = arr[i];
            for (int j = i; j <= arr.length-1; j++) {
                if (arr[j] < min){
                    arr[i] = arr[j];
                    arr[j] = min;
                    min = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
