package org.example.part_04_Multi_threading_Tutorials._05_SynchronizedBlockSolution_MoviePart04;

public class Test_SynchronizedBlock_SynchronizedMethod_Showing_ExecutionTime {
    public static void main(String[] args) {
//========================================================================================
//===============Synchronized Block======================================================
//========================================================================================
        Resources resources = new Resources();
        Thread thread1 = new Thread(resources::processWithSynchronizedBlock);
        Thread thread2 = new Thread(resources::processWithSynchronizedBlock);
        Long startTime1 = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Long endTime1 = System.currentTimeMillis();
        System.out.println("[Synchronized Block] Total execution time: " + (endTime1 - startTime1));
        System.out.println("List1 size: " + resources.getList1().size());
        System.out.println("List2 size: " + resources.getList2().size());
//========================================================================================
//===============Synchronized Method======================================================
//========================================================================================
        Resources resources2 = new Resources();
        Thread thread3 = new Thread(resources2::processWithSynchronizedMethod);
        Thread thread4 = new Thread(resources2::processWithSynchronizedMethod);
        Long startTime2 = System.currentTimeMillis();
        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Long endTime2 = System.currentTimeMillis();
        System.out.println("[Synchronized Method] Total execution time: " + (endTime2 - startTime2));
        System.out.println("List1 size: " + resources.getList1().size());
        System.out.println("List2 size: " + resources.getList2().size());
    }
}
