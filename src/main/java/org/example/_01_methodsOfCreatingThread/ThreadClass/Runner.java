package org.example._01_methodsOfCreatingThread.ThreadClass;

public class Runner extends Thread{
    private final String identifier;
    public Runner(String identifier){
        this.identifier = identifier;
    }
    @Override
    public void run(){
        for(int i=0; i < 1000; i++) {
            System.out.print(identifier);
        }
    }
}
