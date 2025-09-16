package recursion;

public class SumOfNumbers {

    // Parameterized
    public void printSum(int i, int sum){
        if(i < 0){
            System.out.println(sum);
            return;
        }
        printSum(i-1, sum+i);
    }

    //Functional
    public int printSum(int n){
        if(n == 0) return 0;
        return n + printSum(n-1);
    }

    public static void main(String[] args) {
        SumOfNumbers x= new SumOfNumbers();
        x.printSum(5,0);
        System.out.println(x.printSum(5));
    }
}
