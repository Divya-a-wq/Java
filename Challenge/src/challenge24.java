import java.util.Scanner;
public class challenge24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("bitwise NOT operator");
        System.out.print("enter 1st number:");
        int num1=sc.nextInt();

        int result= ~num1;
        System.out.println("result is "+result);

    }

}

