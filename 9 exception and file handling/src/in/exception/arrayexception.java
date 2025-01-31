package in.exception;

import java.util.Scanner;

public class arrayexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a:");
        int a = sc.nextInt();
        System.out.print("enter number b:");
        int b = sc.nextInt();
        try {

            int[] div=new int[5];
            System.out.printf("remainder is: %d", div[6]);
            div[6]= a/ b;
            System.out.printf("remainder is: %d", div[6]);
        } catch (ArithmeticException exception ) {
            System.out.printf("%s,enter valid value",exception.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array is out of bound");
        }
    }
}
