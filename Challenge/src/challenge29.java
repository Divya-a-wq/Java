import java.util.Scanner;
public class challenge29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("sum of odd numbers");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        int sum=sumOfOddNumber(num);
        System.out.println("odd sum till "+num+" is "+sum);
    }

    public static int  sumOfOddNumber(int num){
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;

            i+=2;
        }
        return sum ;
    }
}