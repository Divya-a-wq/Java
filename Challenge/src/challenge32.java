import java.util.Scanner;
public class challenge32 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("LCM");
        System.out.print("enter your number:");
        int num1=sc.nextInt();
        System.out.print("enter your number:");
        int num2=sc.nextInt();
        int LCM=LCM(num1,num2);
        System.out.println("lcm of numbers is "+LCM);
    }

    public static int LCM(int num1 , int num2){
        int i=1;
        while(true){//i<=num2 kabh n kabhi condition true hogi hi
            int factor =num1*i;
            if(factor%num2==0){
                return factor;
            }
            i++;
        }
        //return 0;
    }
}