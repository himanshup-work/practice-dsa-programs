package array;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,23,23,35};
        RemoveDuplicateElements x = new RemoveDuplicateElements();
        x.removeDuplicate(arr);
    }
    public void removeDuplicate(int[] arr){
        int k = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]){
                arr[k] = arr[i+1];
                k++;
            }
        }
        System.out.println(k);
        while (k < arr.length){
            arr[k++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
