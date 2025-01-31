import java.util.Scanner;
public class challenge55{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Absolute number");
        System.out.print("enter your  number:");
        int num=sc.nextInt();

        int result=num<0?-num:num;
        System.out.println("absolute of "+num+" is "+result);
    }
}
