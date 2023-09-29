package org.example.CollectionsSample;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayHashMap1 {
    public static void main(String[] args) {
        ArrayList<HashMap<Integer,Student>> listMap = new ArrayList<>();

        Student st1 = new Student();
        st1.setId(21);
        st1.setName("st1");

        Student st2 = new Student();
        st2.setId(22);
        st2.setName("st2");

        Student st3 = new Student();
        st3.setId(23);
        st3.setName("st3");

        HashMap<Integer,Student> map1 = new HashMap<>();
        map1.put(1,st1);
        map1.put(2,st2);
        map1.put(3,st3);

        HashMap<Integer,Student> map2 = new HashMap<>();
        map2.put(1,st1);
        map2.put(2,st2);
        map2.put(3,st3);

        HashMap<Integer,Student> map3 = new HashMap<>();
        map3.put(1,st1);
        map3.put(2,st2);
        map3.put(3,st3);

        //add the map to list
        listMap.add(map1);
        listMap.add(map2);
        listMap.add(map3);


        System.out.println(listMap);
        for(HashMap<Integer,Student> mapOBj : listMap){
            System.out.println("-------------------");
            for(Integer key:mapOBj.keySet()){
                System.out.println(key+" "+mapOBj.get(key).getId()+" "+mapOBj.get(key).getName());
            }
            System.out.println("-------------------");
        }

    }
}
