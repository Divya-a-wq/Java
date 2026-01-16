import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int[] num=new int[4];
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 4 elements: ");
        for (int i = 0; i < num.length ; i++) {
            num[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < num.length ; i++) {
            sum+=num[i];

        }
        double average=(double) sum/ num.length;
        System.out.print("The average is: " +average);

    }
}
