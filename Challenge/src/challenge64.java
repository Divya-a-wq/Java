import java.util.Scanner;
public class challenge64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("occurence of specific nuber using foreach loop ");
        int[] array=ArrayUtility.inputArray();
        System.out.print("enter the number you want to search:");
        int nums=sc.nextInt();
        int occ=noOfOccurence(array, nums);
        System.out.println("your element was found: "+occ+" times");
    }
    public static int noOfOccurence(int[] array,int nums){
        int occ=0;
        for(int num:array){
            if(num==nums){
                occ++;
            }
        }
        return occ;
    }
}
