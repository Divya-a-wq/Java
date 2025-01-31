package in.div.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testingCollection {
    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<Integer>();
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(1);
        utility.print(numList);
        Collections.sort(numList);//for sorting the element
        utility.print(numList);
        Collections.reverse(numList);
        utility.print(numList);
        List<Integer> unmodifiable=Collections.unmodifiableList(numList);//Exception in thread "main" java.lang.UnsupportedOperationException
        unmodifiable.add(76);
    }
}
