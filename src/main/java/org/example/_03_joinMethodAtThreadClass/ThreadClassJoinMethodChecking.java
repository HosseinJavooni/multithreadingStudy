package org.example._03_joinMethodAtThreadClass;

public class ThreadClassJoinMethodChecking {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for(int i=0; i < 1000; i++){
                System.out.print("0");
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i=0; i < 1000; i++){
                System.out.print("_");
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
//            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("last Line of the main method.");
    }
}
