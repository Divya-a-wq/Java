import java.util.Scanner;

public class challenge63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("max array by foreach loop");
        int[] array=ArrayUtility.inputArray();
        int max=Integer.MIN_VALUE;
        for(int num:array){
            if(max<num){
                max=num;

            }
        }

        System.out.println("maximum in array is: " + max);
    }
}