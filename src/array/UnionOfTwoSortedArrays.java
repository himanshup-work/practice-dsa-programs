package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};
        UnionOfTwoSortedArrays u = new UnionOfTwoSortedArrays();
        u.union(arr1,arr2);
    }
    public void union(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int left = 0;
        int right = 0;
        List<Integer> result = new ArrayList<>();
        while (left<n1 && right<n2){
            if (left>0 && arr1[left] == arr1[left-1]) {
                left++;
                continue;
            }
            if (right>0 && arr2[right] == arr2[right-1]) {
                right++;
                continue;
            }
            if (arr1[left] < arr2[right]){
                result.add(arr1[left]);
                left++;
            }else if (arr1[left] > arr2[right]) {
                result.add(arr2[right]);
                right++;
            }else {
                result.add(arr1[left]);
                left++;
                right++;
            }
        }
        while (left < n1) {
            if (left == 0 || arr1[left] != arr1[left - 1])
                result.add(arr1[left]);
            left++;
        }

        while (right < n2) {
            if (right == 0 || arr2[right] != arr2[right - 1])
                result.add(arr2[right]);
            right++;
        }
        System.out.println(result);
    }
}
