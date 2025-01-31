import java.util.Scanner;
public class challenge31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("sum of integer");
        System.out.print("enter your integer:");
        int num=sc.nextInt();
        int sum=sumOfDigit(num);
        System.out.println("sum of "+num+" is "+sum);
    }

    public static int  sumOfDigit(int num){
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        return sum ;
    }
}