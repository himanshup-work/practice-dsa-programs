package math;

public class GCD {
    public static void main(String[] args) {
//        int gcd = 1;
        int n1 = 16;
        int n2 = 12;
//        int n = Math.min(n1, n2);
//        for (int i = 1; i <= n; i++) {
//            if (n1%i == 0 && n2%i == 0){
//                gcd = i;
//            }
//        }

        // By euclidean algo
        while (n1>0 && n2>0){
            if (n1>n2){
                n1=n1%n2;
            }else {
                n2=n2%n1;
            }
        }
        if(n1==0){
            System.out.println(n2);
        }else {
            System.out.println(n1);
        }
//        System.out.println(gcd);
    }
}
