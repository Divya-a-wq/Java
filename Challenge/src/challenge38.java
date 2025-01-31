import java.util.Scanner;
public class challenge38{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("palindrome number");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        boolean ispalindrome=ispalindrome(num);
        //System.out.println(isArmstrong);
        if(ispalindrome){
            System.out.println("your number is palindrome");
        }else{
            System.out.println("your number is not palindrome");
        }
    }
    public static boolean ispalindrome(int num){

        return num==reverse(num);


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