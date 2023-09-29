package org.example.CollectionsSample;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayHashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<Integer,String>> listMap = new ArrayList<>();

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(3,"three");

        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(1,"one");
        map2.put(2,"two");
        map2.put(3,"three");

        HashMap<Integer,String> map3 = new HashMap<>();
        map3.put(1,"one");
        map3.put(2,"two");
        map3.put(3,"three");

        listMap.add(map1);
        listMap.add(map2);
        listMap.add(map3);

        System.out.println(listMap);

        HashMap<Integer,String> mapObj = listMap.get(0);
        System.out.println(mapObj.get(1));

        for(HashMap<Integer,String> mapObjITR: listMap){
            System.out.println("-----");

            for(String v:mapObjITR.values()){
                System.out.println(v);
            }
            System.out.println("-----");
        }

    }
}
