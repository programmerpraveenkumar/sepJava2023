package org.example.CollectionsSample.MapSample;

import java.util.HashMap;
import java.util.TreeMap;

/*
map will not allow the duplicate keys
TreeMap will not maintain the insertion order.
but will sort the data by key in ascending order.

 */
public class TreeMapSample {
    public static void main(String[] args) {
        TreeMap<String,Integer> mapObj = new TreeMap<>();
        mapObj.put("two",2);
        mapObj.put("abc",0);
        mapObj.put("one",1);
        mapObj.put("twoo",2);
        mapObj.put("three",3);
        mapObj.put("abc",10);
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
