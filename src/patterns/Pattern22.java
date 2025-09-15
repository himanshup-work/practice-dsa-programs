package patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int n =5;
        int num = 2*n;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n - 1; j++) {
                int top = i;
                int botton = 2*n-2-i;
                int left = j;
                int right = 2*n-2-j;
                System.out.print(n - Math.min(Math.min(top,botton), Math.min(left,right)) + " ");
            }
            System.out.println();
        }
    }
}
