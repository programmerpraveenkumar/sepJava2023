package org.example.CollectionsSample;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayLisSample5 {
    public static void main(String[] args) {
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("zebra");
        listStr.add("cat");
        listStr.add("deer");
        listStr.add("dog");
        listStr.add("lion");
        System.out.println(listStr);
    List<String> strList = listStr.stream().sorted().collect(Collectors.toList());
        System.out.println(strList);


        ArrayList<Integer> listint = new ArrayList<>();
        listint.add(10);
        listint.add(15);
        listint.add(410);
        listint.add(1);
        System.out.println(listint);
        List<Integer> intList = listint.stream().sorted().collect(Collectors.toList());
        System.out.println(intList);
    }
}
