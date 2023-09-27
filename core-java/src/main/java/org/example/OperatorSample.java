package org.example;

public class OperatorSample {
    int num1 = 48;
    int num2 = 98;
    int num3 = 98;
    static int num4 = 32;//static variable
    public static void main(String[] args) {
        OperatorSample operatorSample= new OperatorSample();
        int result = operatorSample.num1+operatorSample.num2+num4;//add operator
        System.out.println(result);

        int resultSub = operatorSample.num1-operatorSample.num2;//sub operator
        int resultMul = operatorSample.num1*operatorSample.num2;//mul operator
        int resultDiv = operatorSample.num1/operatorSample.num2;//div operator
        /*
            100 >52 true
            487 >1252 false
            500 >= 500 true
         */
        System.out.println(operatorSample.num1 > operatorSample.num2);
        System.out.println(operatorSample.num1 < operatorSample.num2);
        System.out.println(operatorSample.num2 <= operatorSample.num3);

        /*
            and operator &&
            (operatorSample.num1 < operatorSample.num2) && (operatorSample.num2 <= operatorSample.num3)
         */
        boolean status = (operatorSample.num1 < operatorSample.num1) && (operatorSample.num2 <= operatorSample.num3);
        System.out.println(status);
       boolean status1 = (operatorSample.num1 < operatorSample.num1) || (operatorSample.num2 <= operatorSample.num3);
      System.out.println(status1);
    }
}
