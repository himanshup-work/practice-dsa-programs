package hashing;

public class FrequencyOfNumbers {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,3,2,1,3};
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int[] arr2 = {1,4,2,3,12};
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i] +" -> "+ hash[arr2[i]]);
        }
    }

}
