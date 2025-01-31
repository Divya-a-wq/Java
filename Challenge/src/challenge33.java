import java.util.Scanner;
public class challenge33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("greatest comman divisor");
        System.out.print("enter your number:");
        int num1=sc.nextInt();
        System.out.print("enter your number:");
        int num2=sc.nextInt();
        int GCD=GCD(num1,num2);// it does not necessary to be initialise num1 and num2 parameter as same as below mentioned parameter in method 
        System.out.println("greatest comman divisor of numbers is "+GCD);
    }

    public static int GCD(int num1 , int num2){//num1 and num2 can be named as other name like first and seocnd
        int gcd=1;
        int i=2;
        int least=least(num1,num2);
        while(i<=least){
            if(num1%i==0&&num2%i==0){
                gcd=i;
            }


            i++;
        }
        return gcd;
    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }
    }
}