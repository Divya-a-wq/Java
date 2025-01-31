package in.div.filterAndreduce;

import java.util.List;
import java.util.function.Consumer;

public class testingFilter {
    public static void main(String[] args) {
        List<String> fruits=List.of("apple","banana","mango","grape");
        System.out.println(fruits.size());
        System.out.println("printing fruit normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("printing fruit using stream");
        fruits.stream().forEach(new Consumer<String>(){
        @Override
        public void accept(String fruits){
        System.out.println(fruits);
        }
        });
        System.out.println("printing fruit using filter");
        fruits.stream()
                .filter(fruit ->fruit.endsWith("a"))
                .forEach(fruit -> System.out.println(fruit));//lambda method for make code concise// forEach terminal operator
    }

}
