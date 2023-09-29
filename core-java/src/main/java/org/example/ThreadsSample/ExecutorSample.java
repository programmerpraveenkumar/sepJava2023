package org.example.ThreadsSample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.shutdown();

    }
}
