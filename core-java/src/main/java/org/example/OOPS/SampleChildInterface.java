package org.example.OOPS;

public class SampleChildInterface implements SampleInterface,SampleInterface2{
    @Override
    public void printMessage() {
        System.out.println("this is child interface printMessage");
    }

    @Override
    public void printMessage2() {
        System.out.println("this is child interface printMessage2");
    }

    public void printNumber(){
        System.out.println("this is print number");
    }

    public static void main(String[] args) {
        SampleChildInterface childInterface = new SampleChildInterface();
        childInterface.printMessage();
        childInterface.printMessage2();

        //creating object for parent interface using child class.
        SampleInterface sampleInterface = new SampleChildInterface();
        sampleInterface.printMessage();
        //sampleInterface.printNumber()//will not be called.
    }
}
