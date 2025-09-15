package math;

import static java.lang.Math.log10;

public class Armstrong {
    public static void main(String[] args) {
        int num = 1535;
        int temp = num;
        int sum = 0;
        int count = (int) (log10(num))+1;
        while (temp>0){
            int lastDigit = temp%10;
            sum = (int) (sum + Math.pow(lastDigit, count));
            temp = temp/10;
        }
        if (num == sum){
            System.out.println(num + " is a Armstrong number.");
        }else {
            System.out.println(num + " is not a Armstrong number.");
        }
    }
}
