package org.example.OOPS;

/*
interview question:
diff b/w overloading and overriding
inheritance->inherit the props from the parent class
extends keyword will help to inherit the parent class
 */
public class ChildClass extends ParentClass{
    public static void main(String[] args) {
        ChildClass childClass= new ChildClass();
        //directly access the parent method using child object
        int result = childClass.getAddResult();
        System.out.println(result);
        ParentClass parentClass= new ParentClass();
        parentClass.getAddResult();
    }

    /*
    override from the parent class
    */
//    @Override
//    public int getAddResult() {
//        System.out.println("this is child class");
//        return 10;
//    }
}
