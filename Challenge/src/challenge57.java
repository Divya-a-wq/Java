import java.util.Scanner;
public class challenge57 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("calender");
        System.out.print("enter your month number:");
        int month=sc.nextInt();
        String output=switch(month){
            case 1->"january";
            case 2->"february";
            case 3->"march";
            case 4->"april";
            case 5->"may";
            case 6->"june";
            case 7->"july";
            case 8->"august";
            case 9->"september";
            case 10->"october";
            case 11->"november";
            case 12->"december";
            default->"invalid month";

        };
        System.out.println(output);
    }
}