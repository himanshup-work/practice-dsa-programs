package patterns;

public class Pattern15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (char ch = 'A'; ch <= 'A'+5-i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
