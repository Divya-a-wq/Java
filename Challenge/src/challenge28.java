import java.util.Scanner;
public class challenge28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("multiplication table");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        multiplicationTable(num);
    }

    public static void multiplicationTable(int num){
        int i=1;
        while(i<=10){
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }
    }

}
