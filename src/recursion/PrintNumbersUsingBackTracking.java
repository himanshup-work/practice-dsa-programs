package recursion;

public class PrintNumbersUsingBackTracking {
    public void print(int n){
        if(n == 0) return;
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        PrintNumbersUsingBackTracking obj = new PrintNumbersUsingBackTracking();
        obj.print(10);
    }
}
