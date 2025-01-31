import java.util.Scanner;
public class userinput {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("please enter your name:");
            String name = sc.nextLine();
            System.out.println("good morning "+name);
            System.out.print(name + " also tell me your age:");
            int age = sc.nextInt();
            System.out.println("your age is " +age);
        }

    }
