package in.div.map;

import java.util.HashMap;
import java.util.Map;

public class testingMap {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("divya",23);
        map.put("Ayushi",100);
        map.put("Princy",90);
        System.out.println(map.size());
        System.out.println(map.get("divya"));
        System.out.println(map.containsKey("Ayushi"));
        System.out.println(map.containsKey("samiksha"));
        System.out.println(map.remove("Princy"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n",key,map.get(key));
        }
    }
}
