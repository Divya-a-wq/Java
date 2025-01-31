import java.util.Scanner;
public class challenge26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("showcase rightshift operator");
        System.out.print("enter 1st number:");
        int num=sc.nextInt();

        int result= num>>1;
        System.out.println("result is "+result);

    }

}