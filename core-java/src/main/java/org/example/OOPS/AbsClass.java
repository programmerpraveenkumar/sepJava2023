package org.example.OOPS;
/*
for abstract class can't create object.so can be used in the inheritance as a parent class
can declare the method & variables
if any method declare with abstract ,should not have definition.
 */
public abstract class AbsClass {
    public void printMessage(){
        System.out.println("sample print message");
    }
    public void printAds(){
        System.out.println("this is print ads");
    }
    //below method should be defined in the child class.
    abstract public void performExecution();

}
