package in.div.collection;

import java.util.Collection;

public class utility {
    public static<E> void print(Collection<E> collection){
        System.out.print("collection is: ");
        for(E coll:collection){
            System.out.printf("%s ",coll);
        }
        System.out.println();
    }
}
