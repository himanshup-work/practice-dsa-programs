package patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i < 2*n; i++) {
            int stars = i;
            int spaces = 2*(n-i);
            if (i>n){
                stars = 2*n-i;
                spaces = 2*(i-n);
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
