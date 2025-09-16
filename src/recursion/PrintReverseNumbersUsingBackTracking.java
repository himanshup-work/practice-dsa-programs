package recursion;

public class PrintReverseNumbersUsingBackTracking {
    public void printNumber(int i, int n){
        if (i > n) return;
        printNumber(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        PrintReverseNumbersUsingBackTracking obj = new PrintReverseNumbersUsingBackTracking();
        obj.printNumber(1,10);
    }
}
