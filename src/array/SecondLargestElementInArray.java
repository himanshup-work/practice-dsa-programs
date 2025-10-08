package array;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,23,2,18,3,2,12};
        int largElement = arr[0];
        int secLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largElement){
                largElement = arr[i];
            }else if (arr[i] > secLargest && secLargest < largElement){
                secLargest = arr[i];
            }
        }
        System.out.println(largElement);
        System.out.println(secLargest);
    }

}
