import java.util.Scanner;
public class challenge20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age:");
        int age=sc.nextInt();
        if(age<=13){
            System.out.println("child");
        }else if(age<=20&&age>13){
            System.out.println("teen");
        }else if(age<=60&&age>20){
            System.out.println("adult");
        }else {
            System.out.println("senior");
        }
    }
}