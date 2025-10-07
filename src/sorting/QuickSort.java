package sorting;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {25, 15, 77, 6, 8, 1, 16, 2, 55, 5, 77, 20};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public void sort(int[] arr, int low, int high){
        if(low<high){
            int partIndex = movePivotToItsPlace(arr, low, high);
            sort(arr, low, partIndex-1);
            sort(arr, partIndex+1, high);
        }
    }

    private int movePivotToItsPlace(int[] arr, int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;
        while (i<j){
            while (arr[i] <= arr[pivot] && i <= high-1){
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low+1){
                j--;
            }
            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

}
