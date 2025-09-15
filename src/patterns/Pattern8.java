package patterns;

public class Pattern8 {
    public static void main(String[] args) {
        Pattern8 pattern8 = new Pattern8();
        pattern8.pattern();
    }
    public void pattern(){
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
