package recursion;

public class Palindrome {

    public boolean isPalindrome(int i, String str){
        if (i>=str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return isPalindrome(i+1, str);
    }

    public void print(String str, String revStr, int i){
        if (i == str.length()){
            if (str.equals(revStr)){
                System.out.println("Palindrome");
            }else {
                System.out.println("Not Palindrome");
            }
            return;
        }
        revStr = revStr + str.charAt(str.length()-1-i);
        print(str,revStr,i+1);
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.print("qwertewq", "", 0);
        System.out.println(p.isPalindrome(0,"qwetrewq"));
    }
}
