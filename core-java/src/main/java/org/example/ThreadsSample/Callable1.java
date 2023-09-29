package org.example.ThreadsSample;

import java.util.concurrent.Callable;

public class Callable1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);//pause the thread for 1000ms
        System.out.println("this is thread..");
        return "sample return from the callable thread.";
    }
}
