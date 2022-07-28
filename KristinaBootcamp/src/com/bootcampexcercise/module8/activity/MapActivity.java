package com.bootcampexcercise.module8.activity;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


//
//    key and value can have different data types
public class MapActivity {
    public static void main(String[] args) {
        Map mapA = new HashMap();
        mapA.put("1", "Kristina");
        mapA.put("2", "Sindy");
        MapActivity obj = new MapActivity();
        obj.print(mapA);

    }

    //1 - Type code to create a HashMap of key value pair+
    //where key is id of type String and value is a name+
    //2 - Call print method to print the map passed as its parameter.


    void print(Map mapA) {
        Set keySet = mapA.keySet();
        System.out.println("*************************************");
        System.out.println("Key\tValue");
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "\t" +mapA.get(key));

            //3 - Type code to print this map


        }

    }
}
