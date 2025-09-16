package recursion;

public class PrintNumbers {
    public void printNumber(int i, int n){
        if (i > n) return;
        System.out.println(i);
        printNumber(i+1,n);
    }

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.printNumber(1,10);
    }
}
