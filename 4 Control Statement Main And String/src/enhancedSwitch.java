import java.util.Scanner;

public class enhancedSwitch {



    public static void main(String[] var0) {
        Scanner sc= new Scanner(System.in);
        System.out.println("day checking");
        System.out.print("enter your day number:");
        int day = sc.nextInt();
        String output=switch (day) {
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"saturday";
            // case 6,7->"saturday";//if in case we want same value for 6 and 7 both
            case 7->"Sunday";
            default->"invalid day";
        };
        System.out.println(output);

    }
}
