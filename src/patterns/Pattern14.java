package patterns;

public class Pattern14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int index = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) index);
                index++;
            }
            System.out.println();
        }
    }
}
