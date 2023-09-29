package org.example.CollectionsSample;



public class City implements Comparable<City> {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(this.getId() , o.getId());

//        if(this.getId() > o.getId()){
//            return 1;
//        }else if(this.getId() < o.getId()){
//            return -1;
//        }else{
//            return 0;
//        }
    }
}
