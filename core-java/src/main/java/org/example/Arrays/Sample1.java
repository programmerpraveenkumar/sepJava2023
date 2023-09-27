package org.example.Arrays;

import java.util.Arrays;

/*
array will store the value inthe index.
index starts with 0,1,2,3....
 */
public class Sample1 {
    public static void main(String[] args) {
        int numList[] = {10,45,59};//creating array with values
        System.out.println(numList[0]);//0th index
        System.out.println(numList[1]);//1st index
        //System.out.println(numList[4]);//error

        double  priceList[] = new double[20];//create array with size
        priceList[0] =45.25;
        priceList[3] =45.25;
        System.out.println(priceList[3]);
        Sample1 sample1 = new Sample1();

        sample1.add(numList);

    }

    //method with array arguments
    public void add(int[] priceList){
        //array iteration
        for(int i =0;i<priceList.length;i++){
            System.out.println(priceList[i]);
        }
        //array iteration
        for(int i : priceList){
            System.out.println(i);
        }
    }
}
