import java.util.Scanner;
public class challenge41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of occurence");
        int[] numArray=ArrayUtility.inputArray();
        System.out.print("enter the number you want to find:");
        int num=sc.nextInt();
        int occurrences=numberOfOccurence(numArray,num);
        System.out.println("your element found "+occurrences+" times in the array");
    }
    public static int numberOfOccurence(int[] numArray,int num){
        int occ=0;
        int i=0;
        while(i<numArray.length){
            if(numArray[i]==num){
                occ++;
            }
            i++;



        }
        return occ;

    }
}
