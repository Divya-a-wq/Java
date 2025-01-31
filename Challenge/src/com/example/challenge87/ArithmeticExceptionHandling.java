package com.example.challenge87;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a:");
        int a = sc.nextInt();
        System.out.print("enter number b:");
        int b = sc.nextInt();
        try {
            int div = a / b;
            System.out.printf("divison is %d", div);
        } catch (ArithmeticException e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("divison by zero occured");
            } else {
                throw e;
            }

        }
    }
}

