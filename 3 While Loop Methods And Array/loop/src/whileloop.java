
import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter your number:");
        int num=sc.nextInt();//intialization
        while(num<=10){//condition
            System.out.println(num);//actual work
            num=num+1;//updation
        }
    }

}
