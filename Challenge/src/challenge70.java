public class challenge70 {
    String name;
    int age;
    String rollNumber;
    String House;
    public challenge70(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        House = house;
    }
    @Override// cumpulsory otherwise it will generate a hashcode0
    public String toString() {

        return "Student Detail:{name:"+name
                +",age:"+age
                +",rollNumber:"+rollNumber
                +",House:"+House+"}";

    }
    public static void main(String[] args) {
        challenge70 stu=new challenge70("divya", 21, "3", "shivaji");
        System.out.println(stu);
    }

}