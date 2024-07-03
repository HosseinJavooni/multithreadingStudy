package org.example.part_04_Multi_threading_Tutorials._05_SynchronizedBlockSolution_MoviePart04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Resources {
    private final List<Integer> list1 = new ArrayList<>();
    private final List<Integer> list2 = new ArrayList<>();
    private final Random random = new Random(1000);

    public List<Integer> getList1() {
        return list1;
    }
    public List<Integer> getList2() {
        return list2;
    }
    //======================================
    // Synchronized Methods:
    public synchronized void addToList1_synchronizedMethod(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list1.add(random.nextInt());
    }
    public synchronized void addToList2_synchronizedMethod(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list2.add(random.nextInt());
    }
    public void processWithSynchronizedMethod(){
        for(int i=0; i < 500; i++) {
            addToList1_synchronizedMethod();
            addToList2_synchronizedMethod();
        }
    }
    //======================================
    // Synchronized Blocks:
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    public void addToList1_synchronizedBlock(){
        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt());
        }
    }
    public void addToList2_synchronizedBlock(){
        synchronized (lock2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt());
        }
    }
    public void processWithSynchronizedBlock(){
        for(int i=0; i < 500 ; i++) {
            addToList1_synchronizedBlock();
            addToList2_synchronizedBlock();
        }
    }
}
