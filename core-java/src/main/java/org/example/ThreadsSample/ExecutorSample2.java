package org.example.ThreadsSample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSample2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.submit(new Callable1());
        executorService.shutdown();

    }
}
