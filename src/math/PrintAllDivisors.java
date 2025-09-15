package math;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int num = 36;
        int divisor = 1;
//        while (divisor<=num){
//            if(num%divisor == 0){
//                System.out.print(divisor+" ");
//            }
//            divisor++;
//        }
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num%i == 0){
                divisors.add(i);
                if ((num/i)!= i){
                    divisors.add(num/i);
                }
            }
        }
        divisors.stream().sorted().forEach(System.out::println);
    }
}
