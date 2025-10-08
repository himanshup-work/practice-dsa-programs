package array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,23,2,1,3,2,12};
        int largElement = arr[0];
        if (arr.length == 1){
            System.out.println(largElement);
        }
        for (int j : arr) {
            if (j > largElement) {
                largElement = j;
            }
        }
        System.out.println(largElement);
    }
}
