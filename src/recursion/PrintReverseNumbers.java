package recursion;

public class PrintReverseNumbers {
    public void print(int n){
        if(n == 0) return;
        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args) {
        PrintReverseNumbers printReverseNumbers = new PrintReverseNumbers();
        printReverseNumbers.print(10);
    }
}
