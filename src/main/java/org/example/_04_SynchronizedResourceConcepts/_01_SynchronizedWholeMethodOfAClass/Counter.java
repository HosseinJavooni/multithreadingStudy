package org.example._04_SynchronizedResourceConcepts._01_SynchronizedWholeMethodOfAClass;

public class Counter {
    private int counter;

    public synchronized void synchronizedIncrement(){
        counter++;
    }

    public void nonSynchronizedIncrement(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
