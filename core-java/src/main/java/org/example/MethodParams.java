package org.example;

public class MethodParams {
    public static void main(String[] args) {
        MethodParams methodParams  = new MethodParams();
        methodParams.add(10,15);
        methodParams.add(14,15);
        methodParams.add(17,15);
        methodParams.add(17,15,"sample added");
        //methodParams.add(17,"sample added");//error.no method is matching wth params
        methodParams.add(17,15,85);

    }

//    public void add(int a,int b){
//        System.out.println(a+b);
//    }
    public void add(int a,int b,String message){
        System.out.println(a+b);
    }
    public int add(int a,int b){
        System.out.println(a+b);
        return a+b;
    }

    //method overloading
//    public void add(int a,int b,int c){
//        System.out.println(a+b+c);
//    }

    public boolean add(int a,int b,int c){
        int result = a+b+c;
        return result > 100;
    }

}
