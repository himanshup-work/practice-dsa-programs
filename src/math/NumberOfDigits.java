package math;

import static java.lang.Math.log10;

public class NumberOfDigits {
    public static void main(String[] args) {
        int num = 4598457;
//        int count = (int) (log10(num))+1;
        int count = 0;
        while (num > 0){
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
}
