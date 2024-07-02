package org.example._01_methodsOfCreatingThread.ThreadClass;

public class MainForThreadClass {
    public static void main(String[] args) {
        Runner thread1 = new Runner("0");
        Runner thread2 = new Runner("_");
        thread1.start();
        thread2.start();
    }
}
