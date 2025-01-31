import java.util.Scanner;
public class challenge49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("2D sum and average");
        int[][] numArr=ArrayUtility.input2DArray();
        long sum=sum(numArr);
        double avg=average(numArr);
        System.out.println("your sum of array is: "+sum);
        System.out.println("your average of array is: "+avg);
    }
    public static long sum(int[][] numArr){
        long sum=0;
        int i=0;
        while(i<numArr.length){
            int j=0;
            while(j<numArr[i].length){
                sum+=numArr[i][j];
                j++;
            }
            i++;

        }
        return sum;
    }
    public static double average(int[][] numArr){
        if(numArr.length==0){
            return 0;
        }
        int rows=numArr.length;
        int cols=numArr[0].length;
        double size=rows*cols;
        return sum(numArr)/size;
    }

}
