import java.util.Scanner;
public class challenge43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("sorted Array");
        int[] numArray=ArrayUtility.inputArray();
        boolean isInc=isincreasing(numArray);
        boolean isDec=isdecreasing(numArray);
        if(isInc||isDec){
            System.out.println("your array is sorted");
        }else{
            System.out.println("your array is not sorted");
        }

    }
    public static boolean  isincreasing(int[] numArray){
        int i=1;
        while(i<numArray.length){
            if(numArray[i]<numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isdecreasing(int[] numArray){
        int i=1;
        while(i<numArray.length){
            if(numArray[i]>numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
