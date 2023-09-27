package org.example;
/*
Java Class:
    1.file name should be same class
    2.First letter should be capital.
 */
public class Person {
    //main function
    public static void main(String args[]){
        //only for development or learning purpose
        System.out.println("asdfasfasdfasdf");//should not use in real programming

        //classname object = new classname();
       Person person = new Person();
       person.printMessage();//calling the method using object
       person.printAge();
    }

    public void printMessage(){
        System.out.println("this is printMessage method");
    }
    public void printAge(){
        System.out.println("this is age method");
        /*
        * return statement should not be added.bcoz it is void .
        * */
        //return 10;//return from this function
    }

    /*
    method declaration with datatype.
    * */
    public int getNumber(){
        System.out.println("this is number");
        /*
        return statement should be the last line
        while return method should mention the datatype
        */
        return 10;//return from this function
    }

}
