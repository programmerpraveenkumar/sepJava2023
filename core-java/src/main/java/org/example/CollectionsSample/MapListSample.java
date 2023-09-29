package org.example.CollectionsSample;

import java.util.ArrayList;
import java.util.HashMap;

public class MapListSample {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> mapList = new HashMap<>();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("test");
        list1.add("test1");
        list1.add("test2");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("test");
        list2.add("test1");
        list2.add("test2");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("test");
        list3.add("test1");
        list3.add("test2");


        mapList.put(1,list1);
        mapList.put(2,list2);
        mapList.put(3,list3);

        System.out.println(mapList);
        mapList.forEach((k,v)->{
            System.out.println("---------------------");
            v.forEach((s -> {
                System.out.println(s);
            }));
            System.out.println("---------------------");
        });


    }
}
