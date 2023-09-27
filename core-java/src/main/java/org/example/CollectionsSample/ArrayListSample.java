package org.example.CollectionsSample;

import java.lang.reflect.Array;
import java.util.ArrayList;
/*

 */
public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);//add the data to the list
        intList.add(20);//add the data to the list
        intList.add(30);//add the data to the list
        intList.add(40);//add the data to the list
        System.out.println(intList);
        System.out.println(intList.size());

        //check value is exsit in the list or not.
        System.out.println(intList.contains(50));

        intList.remove(2);//remove the data by index

        System.out.println("after remove");
        System.out.println(intList);



        ArrayList<Double> dblList = new ArrayList<>();
        dblList.add(10.25);//add the data to the list
        dblList.add(20.65);//add the data to the list
        dblList.add(30.68);//add the data to the list
        dblList.add(40.87);//add the data to the list
        System.out.println(dblList);
        System.out.println(dblList.size());
        System.out.println(dblList.contains(50.25));

        ArrayList<String> strList1 = new ArrayList<>();
        strList1.add("first");
        strList1.add("second");
        strList1.add("third");
        strList1.add("four");

        ArrayList<String> strList2 = new ArrayList<>();
        strList2.add("first");
        strList2.add("second");
        strList2.add("third");
        strList2.add("four");
        System.out.println(strList1);
        strList1.addAll(strList1);//merge two lists
        System.out.println(strList1);
        System.out.println("-------------------------");
        for(Integer intObj:intList){
            System.out.println(intObj);
        }
        System.out.println("-------------------------");
        for(String str:strList1){
            System.out.println(str);
        }
        System.out.println("-------------------------");
        for(int i=0;i<strList1.size();i++){
            System.out.println(strList1.get(i));
        }
        System.out.println("-------------------------");

        strList1.forEach(o->{
            System.out.println(o);
        });

    }
}
