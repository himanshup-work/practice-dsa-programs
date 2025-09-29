package recursion;

public class PrintFibonacci {

    public int print(int n){
        if(n<=1){
            return n;
        }
        int last = print(n-1);
        int sLast = print(n-2);
        return last + sLast;
    }

    public static void main(String[] args) {
        int n = 6;
        // 0 1 1 2 3 5 8
        PrintFibonacci x = new PrintFibonacci();
        System.out.println(x.print(n));
    }
}
