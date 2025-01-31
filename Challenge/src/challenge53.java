import java.util.Scanner;
public class challenge53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("minimum of two number");
        System.out.print("enter your first number");
        int num1=sc.nextInt();
        System.out.print("enter your second number");
        int num2=sc.nextInt();
        challenge53 ternary=new challenge53();
        int min=ternary.min(num1,num2);
        System.out.println(min + " is the minimum number");
    }
    public int min(int num1,int num2){
        int minimumNumber=num1<num2?num1:num2;

        return minimumNumber;
    }
}
