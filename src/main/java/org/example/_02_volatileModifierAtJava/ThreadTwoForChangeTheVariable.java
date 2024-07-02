package org.example._02_volatileModifierAtJava;

public class ThreadTwoForChangeTheVariable extends Thread{
    public static void main(String[] args) {
        ThreadOneWithVolatileModifierField threadOneWithVolatileModifierField1 = new ThreadOneWithVolatileModifierField();
        threadOneWithVolatileModifierField1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadOneWithVolatileModifierField1.setContinueProcess(false);
    }
    ThreadOneWithVolatileModifierField threadOneWithVolatileModifierField = new ThreadOneWithVolatileModifierField();
    @Override
    public void run(){

    }
}
