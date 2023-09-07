package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class MyQueue <T>{
    ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item){
        queue.add(item);
    }
    public void dequeue(){
        queue.remove(0);
    }
    public int size(){
        return queue.size();
    }
    public void reverse(){
        for (int i = queue.size()-1; i >= 0 ;i--){
            queue.add(queue.get(i));
            queue.remove(queue.get(i));
        }
    }
}
