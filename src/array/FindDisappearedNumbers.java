package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        FindDisappearedNumbers l = new FindDisappearedNumbers();
        int[] arr = {1,2,3,3,4,5,6,6,7,8};
        System.out.println(l.findDisappearedNumbers(arr));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 1;
        int j = 0;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        while (i<=n){
            if (j<n && j > 0 && nums[j] == nums[j-1]){
                j++;
                continue;
            }
            if (j < n && nums[j] == i){
                i++;
                j++;
            } else {
                list.add(i);
                i++;
            }
        }

        return list;
    }
}
