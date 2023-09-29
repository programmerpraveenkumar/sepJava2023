package org.example.CollectionsSample.SetSample;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
set will not allow the duplicate
LinkedHashSet will  maintain the insertion order.
 */
public class LinkedHashSetSample {
    public static void main(String[] args) {
        LinkedHashSet<String> strSet = new LinkedHashSet<>();
        strSet.add("test");
        strSet.add("test2");
        strSet.add("test3");
        strSet.add("test4");
        strSet.add("test");//ignore
        System.out.println(strSet);
        strSet.forEach((o->{
            System.out.println(o);
        }));
        System.out.println(strSet.size());//total size of the set
    }
}
