package org.example.CollectionsSample.MapSample;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
map will not allow the duplicate keys
LinkedHashMap will maintain the insertion order.

Interview question::how hashmap will store the data.

 */
public class LinkedHashMapSample {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> mapObj = new LinkedHashMap<>();
        mapObj.put("two",2);
        mapObj.put("one",1);
        mapObj.put("three",3);
        mapObj.put("three",34);//override the value,key should not be duplicate
        System.out.println(mapObj);
        System.out.println(mapObj.get("three"));
        System.out.println(mapObj.get("adsf"));

        /*
        itererator with values
         */
        System.out.println("------------------");
        for (Integer v:mapObj.values()){
            System.out.println(v);
        }
        System.out.println("------------------");
        System.out.println("------------------");
        for (String v:mapObj.keySet()){
            System.out.println(v+" "+mapObj.get(v));
        }
        System.out.println("------------------");
    }
}
