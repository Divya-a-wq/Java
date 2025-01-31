import java.util.Scanner;
public class challenge65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("take input from user til we say exit");
        while(true){
            System.out.print("enter your command:");
            String command=sc.next();

            // if(command.equals("exit")){
            if(command.equalsIgnoreCase("exit")){
                break;

            }
        }
        System.out.println("you have successfully exited");

    }




}

