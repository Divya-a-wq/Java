package in.div.enums;

public class testingEnums {
    public static void main(String[] args) {
        TrafficLight color=TrafficLight.YELLOW;
       // color ="blue";// we can only give color which are assign in trafficlight enum
        Grade grade=Grade.valueOf("D");//
        for (Grade value : Grade.values()) {//iteration
            System.out.println(value);

        }
    }


}
