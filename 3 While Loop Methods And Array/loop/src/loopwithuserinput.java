import java .util.Scanner;
public class loopwithuserinput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number:");
        int i=0;
        while(i<5){
            int num=sc.nextInt();
            System.out.println("your number is: "+num);
            i=i+1;
        }
    }

}
