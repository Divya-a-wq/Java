import java.util.Scanner;

public class arithmaticoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A:");
        int A=sc.nextInt();
        System.out.print("enter B:");
        int B = sc.nextInt();
        int sum = A+B;
        int sub = A-B;
        int mul =A*B;
        int div =A/B;
        int mod =A%B;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        System.out.print("enter C:");
        double C=sc.nextDouble();
        System.out.print("enter D:");
        double D= sc.nextDouble();
        double a = C+D;
        double b = C-D;
        double c =C*D;
        double d =C/D;
        double e =C%D;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);



    }
}