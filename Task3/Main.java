import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        isPalindrome(str);
    }

    public static void isPalindrome(String str) {
        str = str.replaceAll("\\W","");
        StringBuffer buff = new StringBuffer(str);
        buff.reverse();
        String data = buff.toString();
        if(str.equals(data)){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Is not palindrome");
        }
    }
}
