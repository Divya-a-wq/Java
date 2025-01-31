public class stringTester {
    public static void main(String[] args) {
        StringBuilder sp=new StringBuilder("first ");
        sp.append(45);
        sp.append(" now this is the ");// toString se add kar lege object ko tb sp banata jayega
        sp.append(46);
        sp.toString();//but hame return karana hai string ko isliye toString ka use karenge
        System.out.println(sp);
    }

}