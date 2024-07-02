package org.example.SynchronizedResourceConcepts.SynchronizedWholeMethodOfAClass;

public class SampleOfNonSynchronizedResource {
    public static void main(String[] args) {
        Counter counterObject = new Counter();
        // To see synchronization just uncomment statement below and comment next statement
        checkSynchronizedOrNonSynchronized(counterObject, true);
        // To see synchronization just uncomment statement below and comment previous statement
//        checkSynchronizedOrNonSynchronized(counterObject, false);

        System.out.println(counterObject.getCounter());
    }

    private static void checkSynchronizedOrNonSynchronized(Counter counterObject, boolean isSynchronized){
        Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 100000; i++) {
                    if (isSynchronized) {
                        counterObject.synchronizedIncrement();
                    } else {
                        counterObject.nonSynchronizedIncrement();
                    }
                }
        });
        Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 100000; i++) {
                    if (isSynchronized) {
                        counterObject.synchronizedIncrement();
                    } else {
                        counterObject.nonSynchronizedIncrement();
                    }
                }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
