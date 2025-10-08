package array;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,23,23,35};
        LeftRotateArrayByOnePlace x = new LeftRotateArrayByOnePlace();
        x.rotate(arr);
    }
    public void rotate(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
