import java.util.Scanner;
public class challenge56{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Score Categorize");
        System.out.print("enter your score:");
        int score=sc.nextInt();
        String result=score>80?"high":(score>50?"moderate":"low");
        System.out.println("your categoey is: "+result);

    }
}

