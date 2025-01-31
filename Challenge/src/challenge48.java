import java.util.Scanner;
public class challenge48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("2D search");
        int[][] numArr=ArrayUtility.input2DArray();
        System.out.println("enter the number you want to search:");
        int num=sc.nextInt();
        boolean isFound=isSearch(numArr,num);
        if(isFound){
            System.out.println("your number is found");
        }else{
            System.out.println("your number is not found");
        }

    }
    public static boolean isSearch(int[][] numArr, int num){
        int i=0;
        while(i<numArr.length){
            int j=0;
            while(j<numArr[i].length){
                if(numArr[i][j]==num){
                    return true;


                }
                j++;
            }
            i++;
        }
        return false;
    }

}
