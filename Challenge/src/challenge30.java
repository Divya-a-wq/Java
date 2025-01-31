import java.util.Scanner;
public class challenge30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("factorial of number");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        long  fact=factOfNumber(num);
        System.out.println("fact of "+num+" is "+fact);
    }

    public static long  factOfNumber(int num){
        if(num<2){
            return 1;
        }
        long  fact=1;
        int i=2;
        while(i<=num){
            fact=fact*i;

            i+=1;
        }
        return fact ;
    }
}