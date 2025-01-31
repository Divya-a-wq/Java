import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your counting till:");
        int num=sc.nextInt();
        // int i=1;
        // while(i<=num){
        //     System.out.print(i+ " ");
        //     i++;
        // }//while loop
        for(int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
    }
}
