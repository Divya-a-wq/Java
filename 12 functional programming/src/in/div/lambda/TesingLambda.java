package in.div.lambda;


public class TesingLambda {
    public static void main(String[] args) {
        TesingLambda test=new TesingLambda();

        int sum=test.sum(3,4);
        test.printString("this is the best example");
//toPrint single argument hai islye small bracket lagana ooptional hai
        //toPrint -> System.out.println(toPrint);body is single line so the bracket is optional
        //(a,b) ->a+b;// a+b apne aap me expression hai to return likhana optional hai
        //(a,b) -> {
        //int sum=a+b;
        //System.out.println(toPrint);
        //}
        }
        public void printString(String toPrint){
            System.out.println(toPrint);
        }
        public int sum(int a,int b){
        int sum=a+b;
        return sum;
        }
    }
