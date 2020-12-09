package _1030_MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> ize = new HashMap<>();
        ize.put(1, "alma");
        ize.put(2, "barack");
        ize.put(3, "citrom");


        // we cannot directly iterate on a map
        // however we can iterate on the collection returned by it's keySet, values method

        //lets iterate on the keys!
        System.out.println("keys only");
        Set<Integer> keys = ize.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        // lets iterate on the values only
        System.out.println("values only");
        Collection<String> values = ize.values();
        for ( String value: values) {
            System.out.println(value);
        }


        // So let's iterate on all elements (keys and values)
        System.out.println("Iterate on keys and value");
        for (Integer key : keys) {
            System.out.println(key + " " + ize.get(key));
        }

        //finally lets use entrySet
        System.out.println("entry set");
        Set<Map.Entry<Integer, String>> entries = ize.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        ize.putIfAbsent(200, "málna");
        //the same as
        if(ize.containsKey(1)){
            ize.put(199,"eper");
        }
        //after putIfAbsent
        System.out.println("after puIfAbsent");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
