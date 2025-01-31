package in.div.collection;

import java.util.HashSet;
import java.util.Set;
public class testingSet {
    public static void main(String[] args) {
        Set<String> names=new HashSet<String>();//any kind of order is possible in set
        System.out.println(names.add("Divya"));
        System.out.println(names.add("nishad"));
        System.out.println(names.add("kavya"));
        utility.print(names);
        System.out.println(names.add("Divya"));//duplicate are not allowed in set
        utility.print(names);
        System.out.println(names.contains("Divya"));
        System.out.println(names.remove("Divya"));
        utility.print(names);
        System.out.println(names.remove("Divya"));
    }
}
