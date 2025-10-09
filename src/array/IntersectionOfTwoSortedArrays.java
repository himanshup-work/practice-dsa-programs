package array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3,4,5,6,7,8};
        int[] arr2 = {2,3,3,4,4,5,6,8};
        IntersectionOfTwoSortedArrays u = new IntersectionOfTwoSortedArrays();
        u.intersection(arr1,arr2);
    }

    private void intersection(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();
        while (i<n1 && j<n2){
            if (arr1[i] < arr2[j]){
                i++;
                continue;
            }
            if (arr1[i] > arr2[j]){
                j++;
                continue;
            }
            if(arr1[i] == arr2[j]){
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(result);
    }
}
