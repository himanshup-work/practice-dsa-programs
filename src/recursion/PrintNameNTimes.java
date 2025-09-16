package recursion;

public class PrintNameNTimes {
    public void print(int i, int n){
        if (i > n) return;
        System.out.println("Himanshu");
        print(i+1,n);
    }

    public static void main(String[] args) {
        PrintNameNTimes printNameFiveTimes = new PrintNameNTimes();
        printNameFiveTimes.print(1,10);
    }
}
