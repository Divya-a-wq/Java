import java.util.Scanner;
public class challenge58 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("calculator");
        System.out.print("enter your number1:");
        int num1=sc.nextInt();
        System.out.print("enter your number2:");
        int num2=sc.nextInt();
        System.out.print("enter your operation:");
        String operation=sc.next();
        switch(operation){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("there is no such operation");
        }
    }
}