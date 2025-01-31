package in.exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a:");
        int a = sc.nextInt();
        System.out.print("enter number b:");
        int b = sc.nextInt();
        try {
            int div = a / b;
            System.out.printf("remainder is: %d", div);
        } catch (ArithmeticException exception ) {
            System.out.printf("%s,enter valid value",exception.getMessage());
        }
    }
}
