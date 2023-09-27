package org.example;

public class ClassB {
    int num1 = 45;
    int num2 = 56;
    /*
        static member can access only by className
     */
    static  int num3 = 489;
    public int getAddResult(){
        /*
            static method can be access
            directly from non-static method
         */
        sample();
        return num1+num2;
    }
    //methods can be declared as static
    public static void sample(){
        /*
        to access non-static method
        need to create object
        in same class.
         */
//        ClassB classB  = new ClassB();
//        classB.getAddResult();

        System.out.println("sample static method");
    }
}
