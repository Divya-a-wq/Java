import java.util.Scanner;
public class challenge59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("password checker");
        boolean isValid;
        String password;
        do{
            System.out.print("enter your password:");
            password=sc.next();
        }
        while(!isvalidPassword(password));
        System.out.println("thanks for entering a valid password");
    }
    public static boolean isvalidPassword(String password){
        return password.length()>6;
    }
}

