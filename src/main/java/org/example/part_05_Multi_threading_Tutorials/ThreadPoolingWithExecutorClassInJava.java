package org.example.part_05_Multi_threading_Tutorials;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolingWithExecutorClassInJava {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i=0; i < 10; i++){
            executor.submit(new ThreadCreator(i));
        }
        executor.shutdown();
        System.out.println("All task submitted!");
        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All tasks completed.");
    }
}
