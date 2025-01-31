

public class challengeforme {

    public static void main(String[] args) {
        firstPrintPattern();
        secondPrintPattern();

    }
    public static void firstPrintPattern(){
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
    public static void secondPrintPattern(){
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


}
