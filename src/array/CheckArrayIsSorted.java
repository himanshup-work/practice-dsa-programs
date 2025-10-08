package array;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,23,35, 15};
        CheckArrayIsSorted x = new CheckArrayIsSorted();
        System.out.println(x.isSorted(arr));
    }
    public boolean isSorted(int[] arr){
        boolean flag = false;
        for (int i = 0; i <= arr.length-2; i++) {
            if (arr[i] <= arr[i+1]){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
