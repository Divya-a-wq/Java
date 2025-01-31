package in.div.collection;

import java.util.ArrayList;
import java.util.List;

public class testingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();// list must conatin specific type of element ,here angular bracket repersent which type of datatype it is,angular bracket is generic
        strList.add("divya ");
        strList.add("Nishad");
        strList.add(1,"kumari ");
        strList.remove(0);

//        for (int i = 0; i < strList.size(); i++) {
//
//            System.out.print(strList.get(i));
//        }
        for(String str:strList){
            System.out.print(str);
//        }
        }
        if(strList.contains("Nishad")){
            System.out.println(strList.indexOf("nishad"));
        }
    }
}
