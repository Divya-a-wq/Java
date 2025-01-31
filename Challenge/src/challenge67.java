import java.util.Scanner;

public class challenge67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("even till number");
        System.out.print("enter the number till you want to find the even number:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                continue;

            }
            System.out.println(i);

        }




    }

}