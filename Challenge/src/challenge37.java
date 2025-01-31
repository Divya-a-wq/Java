import java.util.Scanner;
public class challenge37{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("armstrong number");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        boolean isArmstrong=isArmstrong(num);
        //System.out.println(isArmstrong);
        if(isArmstrong){
            System.out.println("your number is armstrong");
        }else{
            System.out.println("your number is not armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int numOfDigit =numOfDigit(num);
        int numCopy=num;
// System.out.println("no of digit: "+numOfDigit);
        int finalNumber=0;
        while(num>0){
            int lastDigit=num%10;
            num/=10;
            finalNumber+=pow(lastDigit , numOfDigit);

        }
        //System.out.println("final number is: "+finalNumber);
        return finalNumber==numCopy;
    }
    public static int pow(int first,int second){
        int result=1;
        int i=0;
        while(i<second){
            result*=first;
            i++;
        }
        //System.out.println("pow of "+first+" is: "+result);
        return result;

    }
    public static int numOfDigit(int num){
        int digit=0;
        while(num>0){
            digit++;
            num/=10;
        }
        return digit;
    }
}
    