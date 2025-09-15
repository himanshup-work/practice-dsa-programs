package math;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;
        for (int i = 1; i*i <= num; i++) {
            if (num%i == 0){
                count++;
                if ((num/i)!= i){
                    count++;
                }
            }
        }
        if (count == 2){
            System.out.println(num + " is a Prime number.");
        }else {
            System.out.println(num + " is not a Prime number.");
        }
    }
}
