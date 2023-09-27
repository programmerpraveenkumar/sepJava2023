package org.example;

public class DatatypeSample2 {
    int age = 45;//declare the variable
    long shareMoney = 4554545454l;//should ends with 'l'(small L)
    float price = 155.25f;//should ends with f
    double pricedbl = 45.25;
    char character ='a';
    boolean status = false;

    public static void main(String[] args) {
        DatatypeSample2 datatypeSample2 = new DatatypeSample2();
        System.out.println(datatypeSample2.age);//access the variable.
        System.out.println(datatypeSample2.shareMoney);
        System.out.println(datatypeSample2.price);
        System.out.println(datatypeSample2.pricedbl);
        System.out.println(datatypeSample2.character);
        System.out.println(datatypeSample2.status);

    }
    public void printPrice(){
        //global can access anywhere in the class.
        System.out.println(price);
    }
}
