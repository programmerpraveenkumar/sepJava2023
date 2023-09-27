package org.example.CollectionsSample;

import java.util.*;
import java.util.stream.Collectors;

/*

 */
public class ArrayListSample3 {
    public static void main(String[] args) {
        ArrayList<String> strList1 = new ArrayList<>();
        strList1.add("abc");
        strList1.add("cat");
        strList1.add("elephant");
        strList1.add("tiger");
        strList1.add("lion");
        strList1.add("dog");
        strList1.add("deer");
        strList1.add("zebra");
        List<String> filterList = strList1.stream().filter(o->o.startsWith("a")).collect(Collectors.toList());
        System.out.println(filterList);
        List<String> filterList1 = strList1.stream().filter(o->o.contains("e")).collect(Collectors.toList());
        System.out.println(filterList1);
    }
}
