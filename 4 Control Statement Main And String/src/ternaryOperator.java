import java.util.Scanner;
public class ternaryOperator {
    public static void main(String[] args) {//main method static method hai meant jvm TernaryOperator.Main likh kar call karega
        Scanner sc=new Scanner(System.in);//Scanner sc refrence hai hai Scanner class ka.....(system.in)  contructor hai static ki tarah declare hai
        System.out.println("Number checking");
        System.out.print("plz enter your first number:");
        int num1=sc.nextInt();
        System.out.print("plz enter your second number:");
        int num2=sc.nextInt();
        // int greaternumber;
        // if(num1>num2){
        //     greaternumber=num1;
        // }else{
        //     greaternumber=num2;
        // }
        int greaterNumber=num1>num2?num1:num2;//ternary operator
        System.out.println(greaterNumber + " is greatest number");
    }

}


    