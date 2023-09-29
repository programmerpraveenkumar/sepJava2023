package org.example.CollectionsSample.SetSample;

import java.util.HashSet;
/*
set will not allow the duplicate
hashset will not maintain the insertion order.
 */
public class HashSetSample {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();
        strSet.add("test");
        strSet.add("test2");
        strSet.add("test3");
        strSet.add("test4");
        strSet.add("test");//override
        System.out.println(strSet);
        strSet.forEach((o->{
            System.out.println(o);
        }));
        System.out.println(strSet.size());//total size of the set
    }
}
