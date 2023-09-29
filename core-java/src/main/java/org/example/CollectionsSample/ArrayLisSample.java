package org.example.CollectionsSample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class ArrayLisSample {
    public static void main(String[] args) {
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("zebra");
        listStr.add("cat");
        listStr.add("deer");
        listStr.add("dog");
        listStr.add("lion");
        System.out.println(listStr);
        Collections.sort(listStr);
        System.out.println(listStr);



        ArrayList<Integer> listint = new ArrayList<>();
        for(int i = 100;i>1;i--){
            listint.add(i);
        }
        System.out.println(listint);
        Collections.sort(listint);
        System.out.println(listint);

        Integer[] intobj = {45,78,235,9,562,6};
        List<Integer> listInt1 = Arrays.asList(intobj);//List.of();

    }
}
