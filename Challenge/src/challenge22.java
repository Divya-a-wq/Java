import java.util.Scanner;
public class challenge22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("bitwise OR operator");
        System.out.print("enter 1st number:");
        int num1=sc.nextInt();
        System.out.print("enter 2nd number");
        int num2=sc.nextInt();
        int result= num1|num2;
        System.out.println("result is "+result);

    }

}