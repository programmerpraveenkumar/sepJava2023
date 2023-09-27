package org.example;

public class ClassA {
    public static void main(String[] args) {
        //creating object for other class
        ClassB classB = new ClassB();
        classB.num1 = 50;
        System.out.println(classB.num2+classB.num1);
        System.out.println(classB.getAddResult());

        ClassB classB1 = new ClassB();
        classB1.num1 = 55;
        System.out.println(classB1.num2+classB1.num1);
        System.out.println(classB1.getAddResult());

        //static variable can be access by classname
        System.out.println(ClassB.num3);
        ClassB.num3 = 8;

        //static methods can be access using classname
        ClassB.sample();

    }
}
