package org.example;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class PopulateThread extends Thread{
    protected int [] arr;
    public PopulateThread(String name, int[] arr) {
        super(name);
        this.arr = arr;
    }
}
