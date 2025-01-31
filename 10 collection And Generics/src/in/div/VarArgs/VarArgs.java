package in.div.VarArgs;

public class VarArgs {
    public static void main(String... args) {
        System.out.println(sum(3,5));
//        System.out.println(sum(new int[]{4,5}));
        System.out.println(sum(22,3,4,3,2));
        System.out.println(sum(1,4,3,4,5));
    }
    public static int sum(int first ,int second,int... a){
        int sum=first+second;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }

//    public static int sum(int[] a){
//        int sum=0;
//        for (int i : a) {
//            sum+=i;
//        }
//        return sum;
//    }
//    public static int sum(int a,int b){
//        return a+b;
//    }
}
