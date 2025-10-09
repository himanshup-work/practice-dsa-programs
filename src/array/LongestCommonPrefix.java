package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix l = new LongestCommonPrefix();
        int[] arr = {1,2,3,3,4,5,6,6,7,8};
        System.out.println(l.findDisappearedNumbers(arr));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int j = 0;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (j > 0 && nums[j] == nums[j-1]){
                j++;
            }
            if (nums[j] == i){
                list.add(i);
                j++;
            }
        }
        return list;
    }
}
