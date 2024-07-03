package org.example.part_06_Multi_threading_Tutorials_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatch_Demo {
    public static void main(String[] args) {
        System.out.println("Thread main starts!");
        CountDownLatch countDownLatch = new CountDownLatch(4);
        new Thread(new Service(countDownLatch, 2)).start();
        new Thread(new Service(countDownLatch, 4)).start();
        new Thread(new Service(countDownLatch, 9)).start();
        new Thread(new Service(countDownLatch, 7)).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread main ends!");
    }

    private static class Service implements Runnable{
        private final CountDownLatch countDownLatch;
        private final int sleepTime;

        public Service(CountDownLatch countDownLatch, int sleepTime) {
            this.countDownLatch = countDownLatch;
            this.sleepTime = sleepTime;
        }

        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getName() + " starts");
            try {
                TimeUnit.SECONDS.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " ends");
            countDownLatch.countDown();
        }
    }
}
