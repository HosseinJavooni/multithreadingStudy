package org.example._01_methodsOfCreatingThread.RunnableInterface;

public class ImplementTheRunnableInterface implements Runnable{
    private final String identifier;
    public ImplementTheRunnableInterface(String identifier){
        this.identifier = identifier;
    }
    @Override
    public void run() {
        for(int i=0; i < 1000; i++) {
            System.out.print(identifier);
        }
    }
}
