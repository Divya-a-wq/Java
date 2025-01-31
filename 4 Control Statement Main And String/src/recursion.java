import java.util.Scanner;
public class recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("factorial using recursion");
        System.out.print("enter your number:");
        int num=sc.nextInt();
        long fact=factorial(num);
        System.out.println("factorial of number is: "+fact);
    }
    //     public static long factorial(int num){
//         long result=1;
//         for(int i=1;i<=num;i++){
//             result*=i;
//         }
// return result;
//     }//using simple loop
    public static long factorial(int num){//usin recursion
        if(num==1){
            return 1;//base case stop the infinite call

        }
        return num*factorial(num-1);//recursive call
    }
}