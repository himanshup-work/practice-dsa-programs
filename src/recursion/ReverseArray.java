package recursion;

import java.util.Arrays;

public class ReverseArray {
    // Parameterized recursion: reverses array in place
    public void reverseParameterized(int[] arr, int l, int r) {
        if (l >= r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseParameterized(arr, l + 1, r - 1);
    }

    // Functional recursion: returns a new reversed array
    public int[] reverseFunctional(int[] arr, int l, int r) {
        if (l > r) return new int[arr.length];
        int[] res = reverseFunctional(arr, l + 1, r);
        res[arr.length - 1 - l] = arr[l];
        return res;
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] arr = {7, 8, 5, 6, 9, 5, 4};

        // Parameterized recursion
        reverseArray.reverseParameterized(arr, 0, arr.length - 1);
        System.out.println("Parameterized: " + Arrays.toString(arr));

        // Functional recursion
        int[] arr2 = {7, 8, 5, 6, 9, 5, 4};
        int[] reversed = reverseArray.reverseFunctional(arr2, 0, arr2.length - 1);
        System.out.println("Functional: " + Arrays.toString(reversed));
    }
}
