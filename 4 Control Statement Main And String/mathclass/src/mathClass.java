import java.util.Scanner;
public class mathClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(23.6));
        System.out.println(Math.floor(23.7));
        System.out.println(Math.PI);
        System.out.println(Math.random());
        System.out.println(Math.round(23.7));

        for(int i=0;i<5;i++){
            double random=(Math.random()*100);

            System.out.println(random);//generate number from 0.0 to 1.0
        }
        for(int j=0;j<5;j++){
            long random1=Math.round(Math.random()*100);
            System.out.println(random1);//generate number from 0.0 to 1.0
        }
    }
}
