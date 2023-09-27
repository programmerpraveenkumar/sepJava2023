package org.example.OOPS;

//inherting the abstract class into the child class
public class ChildAbs extends AbsClass{
    @Override
    public void performExecution() {
        System.out.println("this is override method ");
    }
    public void printNumber(){
        System.out.println("sample number");
    }
    public static void main(String[] args) {
        ChildAbs childAbs = new ChildAbs();
        childAbs.printAds();//call parent class method
        childAbs.performExecution();//call child class override method
        //AbsClass absClass = new AbsClass();//error.

        AbsClass absClass= new ChildAbs();
        absClass.performExecution();
        //absClass.printNumber();//error
    }
}
