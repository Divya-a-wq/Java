import java.util.Scanner;
public class challenge42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("max and min number");
        int[] numArray=ArrayUtility.inputArray();
        int max=max(numArray);
        int min=min(numArray);
        System.out.println("max of array is: "+max);
        System.out.println("min of array is: "+min);

    }
    public static int max(int[] numArray){
        while(numArray.length==0){
            return Integer.MIN_VALUE;// integer class for minmum  value MIN_Value=constant hai jo negative ka  sabse bada number jo value hold kar sakta hai whi hai......meant ki yah positive number ki sabse chhoti value ko store karta hai
        }
        int max=numArray[0];
        int i=1;
        while(i<numArray.length){
            if(max<numArray[i]){
                max=numArray[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] numArray){
        int min=Integer.MAX_VALUE;
        int  i=0;
        while(i<numArray.length){
            if(min>numArray[i]){
                min=numArray[i];
            }
            i++;
        }


        return min;
    }
}
