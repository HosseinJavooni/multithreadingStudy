package org.example._01_methodsOfCreatingThread.RunnableInterface;

public class MainForRunnableInterface {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ImplementTheRunnableInterface("="));
        Thread thread2 = new Thread(new ImplementTheRunnableInterface("$"));
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 1000; i++) {
                    System.out.print(".");
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
