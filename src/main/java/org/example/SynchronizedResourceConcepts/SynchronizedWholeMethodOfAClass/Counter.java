package org.example.SynchronizedResourceConcepts.SynchronizedWholeMethodOfAClass;

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
