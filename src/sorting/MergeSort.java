package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {25, 6, 8, 1, 16, 2, 55, 5, 77, 20};
        MergeSort x = new MergeSort();
        x.mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public void mergeSort(int[] arr, int lowIndex, int highIndex){
        if (lowIndex >= highIndex) return;
        int midIndex = (lowIndex+highIndex)/2;
        mergeSort(arr, lowIndex, midIndex);
        mergeSort(arr, midIndex+1, highIndex);
        merge(arr, lowIndex, midIndex, highIndex);
    }

    private void merge(int[] arr, int lowIndex, int midIndex, int highIndex) {
        int[] temp = new int[arr.length];
        int k = 0;
        int left = lowIndex;
        int right = midIndex+1;
        while (left<=midIndex && right<=highIndex){
            if (arr[left] < arr[right]){
                temp[k] = arr[left];
                left++;
            }else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        while (left<=midIndex){
            temp[k] = arr[left];
            left++;
            k++;
        }
        while (right<=highIndex){
            temp[k] = arr[right];
            right++;
            k++;
        }
        for (int i = lowIndex; i <= highIndex; i++) {
            arr[i] = temp[i-lowIndex];
        }
    }
}
