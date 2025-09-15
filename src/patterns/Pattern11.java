package patterns;

public class Pattern11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int start = i%2;
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
