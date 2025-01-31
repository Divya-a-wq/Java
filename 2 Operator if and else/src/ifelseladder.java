public class ifelseladder {
    public static void main(String[] args) {
        boolean isSeniorcitizen = false;
        boolean isanadult = false;
        //    boolean isSeniorcitizen = true;
        //    boolean isanadult = false;
        //    boolean isSeniorcitizen = true;
        //    boolean isanadult = true;


        System.out.println("before if");
        if(isSeniorcitizen){
            System.out.println("hello senior");
            // }else{
            //     if(isanadult){
        }else if(isanadult){
            System.out.println("hello adult");
        }else{
            System.out.println("hello child");
        }
        System.out.println("after if");
    }
}
