package in.div.equals;

public class EqualsAndhashCodeTest {
    public static void main(String[] args) {
        person person1=new person("Divya",20,"123");
        person person2=new person("Divya",20,"123");
       // if(person1==person2) { refrence ko compare karta hai
        if(person1.equals(person2)){
            System.out.println("Equals");
        }else{
            System.out.println("not Equals");
        }
    }
}
