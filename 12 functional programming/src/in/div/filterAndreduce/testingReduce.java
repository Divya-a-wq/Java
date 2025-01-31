package in.div.filterAndreduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class testingReduce {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6);
        int sum=0;
        for (Integer number : numbers) {
            sum+=number;

            
        }
        System.out.println(sum);

        int newSum=numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }
                });
        System.out.printf("\n sum using reduce is %d",newSum);
        int newSum2=numbers.stream()
                .reduce(0,(a,b) ->a+b);
        System.out.printf("\n sum using reducs+lambda is %d",newSum2);
        int max=numbers.stream()
                .reduce(Integer.MIN_VALUE,(a,b) ->a>b?a:b);
        System.out.printf("\n max using reducs+lambda is %d",max);

    }
}
