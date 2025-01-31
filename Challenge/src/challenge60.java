import java.util.Scanner;

public class challenge60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to number guessing game");
        int num=5,guess;
        do{
            System.out.print("plz enter number between 0 to 10:");
            guess=sc.nextInt();

        }
        while(num!=guess);
        System.out.println("you have successfully guess the number");

    }

}
