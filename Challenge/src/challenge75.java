public class challenge75 {//array to String

    public static void main(String[] args) {
        String arr[]=new String[]{"this"," is"," the"," best"," and"," most"," ever"," fine"};
        StringBuilder sb=new StringBuilder();
        for(String str:arr){//for each loop
            sb.append(str).append(" ");


        }
        System.out.println(sb);


    }
}