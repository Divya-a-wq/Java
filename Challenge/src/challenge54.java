import java.util.Scanner;
public class challenge54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("even and odd number");
        System.out.print("enter your  number:");
        int num=sc.nextInt();
        String result=num%2==0?"even":"odd";
        System.out.println("your number is " + result);

    }
}