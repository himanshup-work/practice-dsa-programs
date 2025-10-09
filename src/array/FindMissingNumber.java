package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int n = 8;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] != n){
                System.out.println(n);
                break;
            }
            n--;
        }
    }
}
