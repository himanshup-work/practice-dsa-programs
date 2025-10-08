package array;

import recursion.ReverseArray;

import java.util.Arrays;

public class LeftRotateArrayByGivenPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        LeftRotateArrayByGivenPlace x = new LeftRotateArrayByGivenPlace();
        x.rotate(arr, 2);
    }
    public void rotate(int[] arr, int d){
        int n = arr.length;
        d = d%n;

        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverseParameterized(arr,0,d-1);
        reverseArray.reverseParameterized(arr,d,n-1);
        reverseArray.reverseParameterized(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
