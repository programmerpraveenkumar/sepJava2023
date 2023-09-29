package org.example.ThreadsSample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSample3 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
       Future<String> future =  executorService.submit(new Callable1());
       try{
           System.out.println("starting the thread...");
           //will wait till it gets the response from the thread.
           System.out.println(future.get());
       }catch (Exception e){

       }
        System.out.println("this is the last line");


        executorService.shutdown();

    }
}
