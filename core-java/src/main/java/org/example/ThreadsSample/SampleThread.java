package org.example.ThreadsSample;

public class SampleThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
        System.out.println("this is run method in the thread");
    }

    public static void main(String[] args) {
        SampleThread sampleThread = new SampleThread();
        System.out.println(Thread.currentThread().getName());
        sampleThread.start();//create new thread and execute the logic in the run method
        //sampleThread.run();//will not create new thread.
    }
}
