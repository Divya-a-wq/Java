import java.util.Scanner;
public class challenge72 {//circle
    double radiusInMM;
    challenge72(double radiusInMM){
        this.radiusInMM=radiusInMM;
    }
    double getCircumference(){
        return 2*radiusInMM*Math.PI;
    }
    double getArea(){
        return Math.PI*Math.pow(radiusInMM,2);
    }
    @Override
    public String toString() {

        return "circle props:radius in mm : "+radiusInMM+
                " ,circumference in mm : "+getCircumference()
                +",area in mm : "+getArea();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your radius:");
        double radius=sc.nextDouble();
        challenge72 circle=new challenge72(radius);
        System.out.println(circle);


    }

}
