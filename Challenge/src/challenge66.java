import java.util.Scanner;

public class challenge66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("sum of all positive number");
        int[] array=ArrayUtility.inputArray();
        int sum=0;
        for(int num:array){
            if(num<0){
                continue;
            }
            sum+=num;
        }
        System.out.println("sum of all positive number is: "+sum);

    }

}