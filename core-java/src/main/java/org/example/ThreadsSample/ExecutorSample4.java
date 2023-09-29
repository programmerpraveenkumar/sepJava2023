package org.example.ThreadsSample;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSample4 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ArrayList<Callable<String>> callable1List = new ArrayList<>();

        callable1List.add(()->{
            System.out.println("1st thread");
            return "1st thread";
        });

        callable1List.add(()->{
            System.out.println("2nd thread");
            return "2nd thread";
        });

       callable1List.add(()->{
            System.out.println("3rd thread");
            return "3rd thread";
        });

        try {
            //executorService.invokeAny(callable1List);
            executorService.invokeAll(callable1List);
        }catch (Exception e){

        }


        System.out.println("this is the last line");
        executorService.shutdown();

    }
}
