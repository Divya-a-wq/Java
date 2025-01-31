import java.util.Scanner;

public class challenge69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Checking palindrome or not using recursion");
        System.out.print("Enter your string: ");
        String str = sc.next();
        System.out.println("Your string " + (ispalindrome(str) ? "is a palindrome" : "is not a palindrome"));
    }

    public static boolean ispalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        } else {
            String newStr = str.substring(1, lastPos); // remove first and last characters
            return ispalindrome(newStr);
        }
    }
}