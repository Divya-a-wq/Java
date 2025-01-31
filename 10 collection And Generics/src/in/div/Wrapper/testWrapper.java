package in.div.Wrapper;

public class testWrapper {
    public static void main(String[] args) {
       // Integer first = Integer.valueOf(55);// here Integer serve as object
       // int i=null; not possible in datatype
        Integer i=null;// possible in Integer objeact
        Integer first=5;//autoboxing
        first.byteValue();
        System.out.println(first);
        int seocnd=first;//unboxing
    }
}