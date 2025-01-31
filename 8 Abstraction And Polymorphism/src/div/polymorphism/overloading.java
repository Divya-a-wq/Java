package div.polymorphism;

public class overloading {
    overloading(){
        System.out.println("default constructor call");
    }
    overloading(String pop){//same construcot but differ argument
        System.out.println(pop);
    }
    public int sum(int a,int b){
        return a+b;
    }
    public String sum(String a,String b){
        return a+b;
    }
//    public int sumFourNo(int a,int b,int c,int d){
public int sum(int a,int b,int c,int d){//argument differ but method name same the their no effect or no error
        return a+b+c+d;
    }

    public static void main(String[] args) {
        overloading over=new overloading();
        int sum =over.sum(3,4,5,4);
        over.sum("a","b");
        System.out.println(over.sum(5,sum));
    }
}
