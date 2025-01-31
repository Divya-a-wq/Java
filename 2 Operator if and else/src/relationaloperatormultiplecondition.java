import java.util.Scanner;

public class relationaloperatormultiplecondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to driving licence portal:");
        System.out.print("enter your age:");
        int age = sc.nextInt();
        if(age>=18)
            System.out.println("elgibile for driving licence");
        else
            System.out.println("not eligible for driving licence");
    }

}
