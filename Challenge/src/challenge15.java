import java.util.Scanner;
public class challenge15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter you number:");
        int number=sc.nextInt();
        if(number>0){
            System.out.println("number is +ve");
        }else if(number<0){
            System.out.println("number is -ve");
        }else{
            System.out.println("number is zero");
        }

    }

}