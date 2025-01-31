public class challenge40 {
    public static void main(String[] args) {

        System.out.println("Array sum and Array average");
        int[] numArray=ArrayUtility.inputArray();
        long sum=sum(numArray);
        double avg=average(numArray);
        System.out.println("sum of the number is: "+sum);
        System.out.println("average of number is: "+avg);

    }
    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum+=numArray[i];
            i++;
        }
        return sum;
    }
    public static  double average(int[] numArray){
        double sum=sum(numArray);

        return (sum/numArray.length);


    }




}
