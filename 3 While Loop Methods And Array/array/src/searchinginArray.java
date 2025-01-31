import java.util.Scanner;
public class searchinginArray {
    public static void main(String[] args) {
        int[] myArr={3,6,8,87,654,68,23,9,98,34};
        Scanner sc=new Scanner(System.in);
        System.err.println("Array Searching");
        System.err.print("enter the number you want to search:");
        int num=sc.nextInt();
        boolean isFound=isFound(myArr,num);
        if(isFound){
            System.out.println("you number is found");
        }else{
            System.out.println("your number is not found");
        }
    }
    public static boolean isFound(int myArr[],int num){
        int index=0;
        while(index<myArr.length){
            if(myArr[index]==num){
                return true;
            }
            index++;
        }
        return false;

    }

}