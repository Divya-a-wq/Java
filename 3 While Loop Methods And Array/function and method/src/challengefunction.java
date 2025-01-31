public class challengefunction {

    public static void main(String[] args) {
        firstPrintPattern();
        secondPrintPattern();
        thirdPrintPattern();
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
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public static void thirdPrintPattern(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }

}