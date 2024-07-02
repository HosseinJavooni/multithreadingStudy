package org.example._02_volatileModifierAtJava;

public class ThreadOneWithVolatileModifierField extends Thread{
//    private volatile boolean continueProcess = true;
    private boolean continueProcess = true;
    public void setContinueProcess(boolean continueProcess){
        this.continueProcess = continueProcess;
    }

    @Override
    public void run(){
        int i = 0;
        while (continueProcess){
            System.out.println(i);
            i++;
        }
    }
}
