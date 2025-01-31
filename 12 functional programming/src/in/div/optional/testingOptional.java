package in.div.optional;

import java.util.List;
import java.util.Optional;

public class testingOptional {
    public static void main(String[] args) {
        List<Integer> numbers=List.of();
        Optional<Integer> newSum=numbers.stream()
                .reduce((a,b) ->a+b);
        if(newSum.isPresent()){
            System.out.println(newSum.get());
        }else{
            System.out.println("List is empty");
        }
    }
}
