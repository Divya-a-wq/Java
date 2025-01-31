import java.util.Scanner;
public class challenge19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number got in exam:");
        int number=sc.nextInt();
        if(number>=90){
            System.out.println("grade A");
        }else if(number<90&&number>=75){
            System.out.println("grade B");
        }else if(number<75&&number>=60){
            System.out.println("grade c");
        }else if(number<60&&number>=30){
            System.out.println("grade D");
        }else {
            System.out.println("grade E");
        }
    }
}