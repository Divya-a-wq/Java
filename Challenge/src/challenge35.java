import java.util.Scanner;
public class challenge35 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("reverse");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        long  reverse=reverse(num);
        System.out.println("reverse of number is "+reverse);
    }
    public static long reverse(int num){
        int sum=0;
        int newNum=0;
        while(num>0){
            int digit =(num%10);
            newNum=newNum*10+digit;

            num =num/10;
        }
        return newNum;
    }
}