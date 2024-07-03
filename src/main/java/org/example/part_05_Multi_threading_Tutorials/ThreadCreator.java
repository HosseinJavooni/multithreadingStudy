package org.example.part_05_Multi_threading_Tutorials;

public class ThreadCreator implements Runnable{
    int identifier;
    public ThreadCreator(int identifier){
        this.identifier = identifier;
    }
    @Override
    public void run() {
        System.out.println("Start thread number: " + identifier);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End thread number: " + identifier);

    }
}
