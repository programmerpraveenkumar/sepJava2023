package org.example;

public class DatatypeSample {
/*
    primitive data type.

    byte->

    short->

    int,long->whole numbers

    float,double->decimal number

    char -only one character Ex:'a'

    boolean->true or false


 */
    public static void main(String[] args) {
        int age = 45;//declare the variable
        long shareMoney = 4554545454l;//should ends with 'l'(small L)
        float price = 155.25f;//should ends with f
        double pricedbl = 45.25;
        char character ='a';
        boolean status = false;
        System.out.println(age);//access the variable.
        System.out.println(shareMoney);
        System.out.println(price);
        System.out.println(pricedbl);
        System.out.println(character);
        System.out.println(status);

    }
    public void printPrice(){
        //below price vairable is not exist.
        // so we are getting error
        //System.out.println(price);
    }
}
