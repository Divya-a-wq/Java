import java.util.Scanner;

public class challenge68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("fibonacci series using recursion");
        System.out.print("enter the number:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int position){
        System.out.print(".");//trying to inderstand the recursive call....how many times we call recursive for fibonacci
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }
        return fibonacci(position-1)+fibonacci(position-2);

    }
}