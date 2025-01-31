package in.exception;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {
        a();
    }
    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        d();
    }
    private static void d(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a:");
        int a = sc.nextInt();
        System.out.print("enter number b:");
        int b = sc.nextInt();
        try {

            int[] div=new int[5];
            //System.out.printf("remainder is: %d", div[6]);
            div[6]= a/ b;
            System.out.printf("remainder is: %d", div[6]);
        } catch (ArithmeticException exception ) {
            System.out.printf("%s,enter valid value",exception.getMessage());

        }catch(Throwable th){
            System.out.println("general exception ");
            throw th;
        }finally {
            {
                System.out.println("i am in finally");
            }
        }
    }
}

