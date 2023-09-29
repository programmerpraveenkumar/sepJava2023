package org.example.CollectionsSample.SetSample;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
set will not allow the duplicate
TreeSet will not  maintain the insertion order.
but it will sort the data in ascending order.
 */
public class TreeSetSample {
    public static void main(String[] args) {
        TreeSet<String> strSet = new TreeSet<>();
        strSet.add("zebra");
        strSet.add("cat");
        strSet.add("abc");
        strSet.add("deer");

        System.out.println(strSet);
        strSet.forEach((o->{
            System.out.println(o);
        }));
        System.out.println(strSet.size());//total size of the set

        TreeSet<Integer> intSet = new TreeSet<>();
        intSet.add(10);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(1);

        System.out.println(intSet);
        intSet.forEach((o->{
            System.out.println(o);
        }));
        System.out.println("Total size "+intSet.size());//total size of the set
    }
}
