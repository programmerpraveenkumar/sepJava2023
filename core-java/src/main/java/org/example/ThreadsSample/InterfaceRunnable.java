package org.example.ThreadsSample;

public class InterfaceRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("this is run method in the interface thread");
    }

    public static void main(String[] args) {
        InterfaceRunnable interfaceRunnable = new InterfaceRunnable();
        Thread thread = new Thread(interfaceRunnable);
        thread.start();//create new thread and start the run() method in the thread.
    }
}
