package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,4,5,6,0,7,8,9};
        LinearSearch x = new LinearSearch();
        System.out.println(x.search(arr,9));
    }
    public  int search(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return 0;
    }
}
