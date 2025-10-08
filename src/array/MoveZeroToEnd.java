package array;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,4,5,6,0,7,8,9};
        int k = 0;
        for (int i = 0; i < arr.length-1;i++) {
            if (arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }
        while (k < arr.length){
            arr[k++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
