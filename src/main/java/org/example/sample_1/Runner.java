package org.example.sample_1;

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
