package math;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1030301;
        int temp = num;
        int revNumber = 0;
        while (temp>0){
            int lastDigit = temp%10;
            revNumber = (revNumber*10) + lastDigit;
            temp = temp/10;
        }
        if (num == revNumber){
            System.out.println(num + " is a Palindrome number.");
        }else {
            System.out.println(num + " is not a Palindrome number.");
        }
    }
}
