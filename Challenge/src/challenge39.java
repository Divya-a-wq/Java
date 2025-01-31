import java.util.Scanner;

public class challenge39 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pyramid pattern");
        System.out.print("enter the number of rows:");
        int rows=sc.nextInt();
        rightHalfPyramid();
        reverseRightHalfPyramid ();
        leftHalfPyramid(rows);
    }
    public static void rightHalfPyramid(){
        System.out.println("\nhere is right half pyramid");
        int rows=0;
        while(rows<5){
            System.out.print("*");
            int i=0;

            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println( );
            rows++;
        }
    }
    public static void reverseRightHalfPyramid(){
        System.out.println("\nhere is rverse right half pyramid");
        int rows1=0;
        while(rows1<5){
            System.out.print("*");
            int i1=4;
            while(i1>rows1){

                System.out.print(" *");
                i1--;
            }

            rows1++;
            System.out.println( );

        }
    }

    public static void leftHalfPyramid(int maxRows){
        System.out.println("here is the left half pyramid");
        int rows=maxRows;
        while(rows>0){
            int j=0;
            while(j<rows-1){
                System.out.print("  ");
                j++;
            }
            int i=0;
            while(i<=(maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
}
        