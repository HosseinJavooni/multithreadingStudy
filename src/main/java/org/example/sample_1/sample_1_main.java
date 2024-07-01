package org.example.sample_1;

public class sample_1_main {
    public static void main(String[] args) {
        Runner thread1 = new Runner("0");
        Runner thread2 = new Runner("_");
        thread1.start();
        thread2.start();
    }
}
