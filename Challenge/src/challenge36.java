import java.util.Scanner;
public class challenge36{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("fibonacci series");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        System.out.println("fibonacci of the given number is");
        isfibonacci(num);
    }
    public static void isfibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num==0)return;
        System.out.print("1 ");
        int first =0 ,second=1;
        while(first+second<=num){
            int third=first+second;
            System.out.print(third+" ");

            first=second;
            second=third;
        }
    }
}