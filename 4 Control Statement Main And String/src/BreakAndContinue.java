public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("before Loop");
        for(int i=0;i<1000;i++){
            if(i==101){
                break;//loop ko puri tarak se exit karana ho to break statement use karate hain
            }
            System.out.print(i+" ");
        }
        System.out.println("\nOut of Loop");

        System.out.println("before Loop");
        for(int j=0;j<10;j++){
            if(j==5){
                continue;// loop me iteration skip karana ho to continue statement use karte hain
            }
            System.out.print(j+" ");
        }
        System.out.println("\nOut of Loop");
    }
}