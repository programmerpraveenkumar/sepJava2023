package org.example.CollectionsSample;


import java.util.*;
import java.util.stream.Collectors;

/*

 */
public class ArrayListSample2 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);//add the data to the list
        intList.add(20);//add the data to the list
        intList.add(30);//add the data to the list
        intList.add(40);//add the data to the list
        intList.add(50);//add the data to the list
        intList.add(60);//add the data to the list
        intList.add(70);//add the data to the list
        List<Integer> filterList = intList.stream().filter(o->o>49).collect(Collectors.toList());
        System.out.println(filterList);

    }
}
