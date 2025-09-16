package recursion;

public class PrintFactorial {
    // Parameterized
    public void print(int fact, int i){
        if (i == 0){
            System.out.println(fact);
            return;
        }
        print(fact*i, i-1);
    }

    //Functional
    public int print(int n){
        if (n == 1) return 1;
        return n * print(n-1);
    }

    public static void main(String[] args) {
        PrintFactorial x = new PrintFactorial();
        x.print(1, 5);
        System.out.println(x.print(5));
    }
}
