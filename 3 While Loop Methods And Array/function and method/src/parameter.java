public class parameter {
    public static void main(String[] args) {
        System.out.println(sumtwoNumber(4,7)); //argument
        System.out.println( sumtwoNumber(2,3)); //argument
        System.out.println(sumtwoNumber(6,2)); //argument

    }
    public static int sumtwoNumber(int first , int second){//parameter
        System.out.println("first number received: "+first);
        System.out.println("second number recieved: "+second);
// int sum= first+second;
// return sum;
        return first+second;
    }
}