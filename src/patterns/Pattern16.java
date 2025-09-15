package patterns;

public class Pattern16 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int j = 1; j <= 5 ; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(ch);
            }
            ch = (char) (ch + 1);
            System.out.println();
        }
    }
}
