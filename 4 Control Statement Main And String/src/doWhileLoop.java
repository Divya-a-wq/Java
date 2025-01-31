import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("plz enter your age:");//while loop
        // int age=sc.nextInt();
        // while(age<0||age>100){
        //     System.out.print("plz enter your age:");
        //      age=sc.nextInt();
        int age=-1;
        do{
            System.out.print("plz enter your age:");
            age=sc.nextInt();
        }
        while(age<0||age>100);
        System.out.println("your age is "+age);
    }

}
