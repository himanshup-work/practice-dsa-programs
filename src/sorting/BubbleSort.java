package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {25, 6, 8, 1, 16, 2, 55, 5, 77, 20};
        int n = arr.length;
        for (int i = n-1; i >= 1; i--) {
            boolean isSwap = false;
            for (int j = 0; j <= i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
