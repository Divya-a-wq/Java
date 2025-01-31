import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr first number:");
        int number1 = sc.nextInt();
        System.out.print("enter second number:");
        int number2 = sc.nextInt();
        System.out.println(number1 + number2);
        int sum = number1+number2;
        System.out.println("sum of number is:" +sum);
    }

}