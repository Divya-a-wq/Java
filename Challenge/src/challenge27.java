import java.util.Scanner;
public class challenge27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("odd even by bitwise operator");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        if((num&1)==1){
            System.out.println("odd");

        }else{
            System.out.println("even");
        }

    }
}