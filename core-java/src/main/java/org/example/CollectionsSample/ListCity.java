package org.example.CollectionsSample;


import java.util.*;

public class ListCity {
    public static void main(String[] args) {
        List<City> cityList = new ArrayList();
        City cit1 = new City();
        cit1.setId(40);
        cit1.setName("test1");

        City cit2 = new City();
        cit2.setId(21);
        cit2.setName("test2");

        City cit3 = new City();
        cit3.setId(31);
        cit3.setName("test3");

        cityList.add(cit1);
        cityList.add(cit2);
        cityList.add(cit3);

        cityList.forEach(o->{
            System.out.println(o.getId()+" "+o.getName());
        });
        Collections.sort(cityList);
        System.out.println("--------------");
        cityList.forEach(o->{
            System.out.println(o.getId()+" "+o.getName());
        });

    }
}
