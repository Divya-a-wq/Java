import java.util.Scanner;
public class challenge34 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("prime number");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        boolean isprime=prime(num);
        if(isprime){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }
    }
    public static boolean prime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }


        return true;
    }
}