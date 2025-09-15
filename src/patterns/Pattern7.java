package patterns;

public class Pattern7 {
    public static void main(String[] args) {
        Pattern7 pattern7 = new Pattern7();
        pattern7.pattern();
    }
    public void pattern(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
