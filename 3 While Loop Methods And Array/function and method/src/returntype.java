import java.util.Scanner;
public class returntype {
    public static void main(String[] args) {
        greet();
        int first = readNumber()+1;
        int second = readNumber()+2;
        int sum = first+second;
        System.out.println("the sum of your number is : "+sum);
    }
    public static int readNumber(){
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter  number:");
        int number=sc.nextInt();
        return number;
    }
    public static void greet(){
        System.out.println("welcome to calculator");
    }

}
