package math;

public class ExtractDigit {
    public static void main(String[] args) {
        int num = 58967;
        while (num > 0){
            System.out.println(num%10);
            num = num/10;
        }
    }
}
