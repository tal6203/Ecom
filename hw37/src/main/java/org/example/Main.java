package org.example;

import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        AtomicReference<Logger> log1 = new AtomicReference<>();

        AtomicReference<Logger> log2 = new AtomicReference<>();

        Thread t1 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName());
            log1.set(Logger.getInstance());
        });
        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            log2.set(Logger.getInstance());
        });

        t1.start();
        t2.start();
    }
}