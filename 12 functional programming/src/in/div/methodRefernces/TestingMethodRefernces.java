package in.div.methodRefernces;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodRefernces {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6);
        System.out.println("by with method refrences");
        numbers.stream()
                .filter(num ->num%2==1)
                .forEach(System.out::println);//sytem.out class hai aur println yaha par method hai
        System.out.println("by without method refrences");
        numbers.stream()
                .filter(num ->num%2==1)
                .forEach(num -> System.out.println(num));


        System.out.println("sum with method refrences");
int newSum2=numbers.stream()
                .reduce(0, Integer::sum);
        System.out.printf("\n sum using reducs+lambda is %d",newSum2);


    }
}
