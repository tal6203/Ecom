package org.example;

import java.util.ArrayList;

public class MySet <T> implements IMySet <T>{
    ArrayList <T> set = new ArrayList<>();

    public void insert(T item){
        if (!set.contains(item)){
            set.add(item);
        }
    }

    public void remove(T item){
        int index = set.indexOf(item);
        set.remove(index);
    }
    public int size(){
        return set.size();
    }
}
