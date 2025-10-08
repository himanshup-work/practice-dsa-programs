package math;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int num = 856479000;
        int revNumber = 0;
        while (num!=0){
            int lastDigit = num%10;
            revNumber = (revNumber*10) + lastDigit;
            num = num/10;
        }
        System.out.println(revNumber);
    }
}
